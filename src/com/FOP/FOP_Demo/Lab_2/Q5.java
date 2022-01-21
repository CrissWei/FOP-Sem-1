package com.FOP.FOP_Demo.Lab_2;

import java.util.ArrayList;
import java.util.Random;
/*
* Write a program that generates a random number.
* The range of the random number is 0 to 10000.
* Display the number and the sum of all the digits in the number.
* */
public class Q5 {

    public static void main(String[] args) {
         //methodDr();
         methodMy();

    }

    private static void methodMy() {
        int num = new Random().nextInt(10001);
        System.out.println("The num is:"+num);

        ArrayList<Character> integers = new ArrayList<>();

        String str = num+"";
        char[] chars = str.toCharArray();
        int sum =0;
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
            /////////////////////////////
            //他妈的的为什么不是这个sum+=chars[i];啊啊啊啊啊啊啊啊！
            sum+=chars[i];

            integers.add(chars[i]);
        }
        System.out.println(integers);




        System.out.println("The sum is:"+sum);

    }

    private static void methodDr() {
        Random r = new Random();

        int num = r.nextInt(10001);
        System.out.println("The random number is " + num);

        int sum = 0;
        while (num > 0) {
            int remainder = num % 10;
            sum += remainder;
            num /= 10;
        }

        System.out.println("Sum of all digits in number: " + sum);
    }
}
