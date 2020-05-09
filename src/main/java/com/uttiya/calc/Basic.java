package com.uttiya.calc;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class Basic {
    private static final Logger logger = Logger.getLogger(Basic.class);

    public static void main(String[] args) {

        float a, b, res;
        char choice;
        Basic basic = new Basic();

        do {

            Scanner sc = new Scanner(System.in);

            System.out.println("Menu");
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("5. Exit");

            System.out.println("Enter your choice:");
            choice = sc.next().charAt(0);

            System.out.println("Enter your choice:");
            choice = sc.next().charAt(0);

            switch (choice) {


                default:
                    System.out.println("Invalid choice");
            }

        }while (choice != '5');
    }
}
