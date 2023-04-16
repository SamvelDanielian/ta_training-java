package com.epam.training.student_Samvel_Danielyan;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentValue;
        int average;
        int sum = 0;
        int k = 0;

        do{
            currentValue = scanner.nextInt();
            if (currentValue==0){
                break;
            }
            sum += currentValue;
            k++;
        }while (currentValue!=0);

        average = sum/k;
        System.out.println(average);
    }
}