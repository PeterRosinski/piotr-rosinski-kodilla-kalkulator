package com.company;

import java.io.*;

public class Calculator {

    public double add(double a, double b) {
        return a+b;
    }

    public double substract(double a, double b) {
        return a-b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.print("5.5 + 17.8 = ");
        System.out.println(calculator.add(5.5, 17.8));
        System.out.print("17.8 - 5.5 = ");
        System.out.println(calculator.substract(17.8, 5.5));
    }
}