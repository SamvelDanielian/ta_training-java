package com.epam.training.student_Samvel_Danielyan;

import java.util.Locale;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminatory = (b*b)-4*a*c;

        if(discriminatory>0){
            double x1 = (-b-Math.sqrt(discriminatory))/(2*a);
            double x2 = (-b+Math.sqrt(discriminatory))/(2*a);
            System.out.println(x1 + " " + x2);
        }
        else if(discriminatory==0){
            double x = (-b)/(2*a);
            if(x == -0.0){
                x = 0.0;
            }
            System.out.println(x);
        }
        else {
            System.out.println("no roots");
        }


    }

}