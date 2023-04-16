package com.epam.training.student_Samvel_Danielyan.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        Scanner sc1 = new Scanner(System.in);
        int numOfStrangers = sc1.nextInt();
        if(numOfStrangers>0) {
            String [] strangers = new String[numOfStrangers];
            for(int i = 0; i<numOfStrangers; i++){
                Scanner newSc = new Scanner (System.in);
                String nameOfStranger = newSc.nextLine();
                strangers[i] = nameOfStranger;
            }
            for (int j = 0; j < numOfStrangers; j++) {
                System.out.println("Hello, " + strangers[j]);
            }
        }
        else if(numOfStrangers==0) {
            System.out.println("Oh, it looks like there is no one here");
        }
        else {
            System.out.println("Seriously? Why so negative?");
        }
    }
}
