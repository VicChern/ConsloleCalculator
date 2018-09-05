package com;

import java.io.*;
import java.util.*;


class CalculateInput {
    static Scanner sc = new Scanner(System.in);
    static String operation;
    static int num1, num2, sum;

    public static void main(String args[]) {
        result();
    }


    public static int operations() {

        switch (operation) {

            case "+":
                sum = num1 + num2;
                break;
            case "-":
                sum = num1 - num2;
                break;
            case "/":
                sum = num1 / num2;
                break;
            case "*":
                sum = num1 * num2;
        }
        return sum;
    }

    public static void result() {
        System.out.println("Enter your operation: ");

        num1 = sc.nextInt();
        operation = sc.next();
        num2 = sc.nextInt();


//            sc.close();
//            if ((num1 != sc.nextInt()) || (num2 != sc.nextInt())) {
//                System.out.println("Wrong enter, please repeat");
//                return;
//            }


        System.out.println("Result is : " + operations());
    }
}


