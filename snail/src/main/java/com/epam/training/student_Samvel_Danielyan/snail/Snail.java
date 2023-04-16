package com.epam.training.student_Samvel_Danielyan.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int days = 0;
        int sum = 0;
        if(a>b || a>=h) {
            do {
                days++;
                sum = sum + a;
                if (sum >= h) {
                    break;
                }
                sum -= b;
            } while (sum < h);
            System.out.println(days);
        }
        else {
            System.out.println("Impossible");
        }
    }
}
