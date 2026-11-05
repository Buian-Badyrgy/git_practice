package com.example;

import java.util.Scanner;

public class Main {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Simple Calculator ===");
        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();
        System.out.println("Sum: " + add(a, b));
    }
}
