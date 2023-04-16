package com.epam.training.student_Samvel_Danielyan.sequence;

import java.util.Scanner;

public class FindMaxInSeq {
    public static int max(){

        Scanner sc = new Scanner(System.in);
        int max = -999999999;
        int currentValue;

        do{
            currentValue = sc.nextInt();

            if(currentValue>max && currentValue!=0){
                max = currentValue;
            }

            if(currentValue == 0){
                break;
            }

        }while(currentValue!=0);

        return max;
    }

    public static void main(String[] args) {
        FindMaxInSeq fmis = new FindMaxInSeq();
        System.out.println(fmis.max());
    }
}