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
                case '1':
                    System.out.println("Enter first number:");
                    a = sc.nextFloat();
                    System.out.println("Enter second number:");
                    b = sc.nextFloat();
                    res = basic.add(a, b);
                    System.out.println("Sum is = " + res);
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }while (choice != '5');
    }

    float add(float a,float b){
        logger.info("Adding " + a + " with " + b);
        float c=a+b;
        logger.info("Result is " + c);
        return c;
    }

}
