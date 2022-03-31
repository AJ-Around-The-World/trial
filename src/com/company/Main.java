package com.company;

import java.util.Scanner;

// Exercise five

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the following:\n");

        System.out.print("X is equal to: \n");
        int x = scanner.nextInt();

        System.out.println("Y is equal to: ");
        int y = scanner.nextInt();


        if (x / y == 5 ) {
            x = 100;
            System.out.println("X now is: " + x);
        }
        else if (x * y == 5) {
            x = 1;
            System.out.println("X now is: " + x);
        }
        else if (x < y) {
            x = x * 2;
            System.out.println("X now is: " + x);
        }
        else if (x > y) {
            x++;
            System.out.println("X now is: " + x);
        }


    }
}