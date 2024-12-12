package com.dailyques;
import java.util.Scanner;
public class DailyQues_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of A:-");
        int a = sc.nextInt();
        System.out.println("Enter the Value of B:-");
        int b = sc.nextInt();
        System.out.println("Enter the Value of N:-");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("The Operation Will be Addition\n" + (a + b));
                break;
            case 2:
                System.out.println("The Operation Will be Subtraction\n" + (b - a));
                break;
            case 3:
                System.out.println("The Operation Will be Multiplication\n" + (a * b));
                break;
            case 4:
                System.out.println("The Operation Will be Division\n" + (a / b));
                break;
            default:
                System.out.println(-1);
        }
    }
}