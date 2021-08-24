package com.company;

import java.util.Scanner;
import java.lang.Math;
public class Main {


    public static void main(String[] args) {
        sqrRoot();

    }
    //public static void sqrRoot(){
    //    System.out.println("Enter 1 for Square root and 2 for Square");
      //  Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the number for its square root");
        //boolean checkRoot = scanner.hasNextDouble();
   //     int userInput = scanner.nextInt();
     //   scanner.nextLine();
       // if (userInput == 1) {
         //   return squareRoot();
       // } else if (userInput == 2) {
         //   return numSquare();
       // }
    //}
    public static void sqrRoot() {
        System.out.println("Enter 1 for Square root and 2 for Square");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for its square root");
        boolean checkRoot = scanner.hasNextDouble();
        int userInput = scanner.nextInt();
        scanner.nextLine();
        if (userInput == 1) {
            private static void squareRoot(){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the number for its square root");
                boolean checkRoot = scanner.hasNextDouble();
                if (!checkRoot) {
                    System.out.println("Invalid Input");
                } else {
                    double num = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println(Math.sqrt(num));
                }
            }
        } else if (userInput == 2) {
            private static void numSquare() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the number for its square");
                boolean checkSquare = scanner.hasNextDouble();
                if (!checkSquare) {
                    System.out.println("Invalid Input");
                } else {
                    double num = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println(num * num);
                }
            }
        }
    }
}