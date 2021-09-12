/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */

import java.util.Scanner;

import static java.lang.Float.parseFloat;

public class ex10 {
    static final double TAX = .055;
    public static void main(String[] args){
        Scanner inScan = new Scanner(System.in);

        double subtotal = 0.0;
        float[][] shoppingCart = new float[3][2];
        for (int i = 0; i < 3; i++){
            System.out.printf("Enter the price of item %d: ", i + 1);
            shoppingCart[i][0] = parseFloat(inScan.nextLine());
            System.out.printf("Enter the quantity of item %d: ", i + 1);
            shoppingCart[i][1] = parseFloat(inScan.nextLine());
            subtotal += shoppingCart[i][0] * shoppingCart[i][1];
        }
        double taxCost = subtotal * TAX;

        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f\n", subtotal, taxCost, subtotal + taxCost);
    }

}
