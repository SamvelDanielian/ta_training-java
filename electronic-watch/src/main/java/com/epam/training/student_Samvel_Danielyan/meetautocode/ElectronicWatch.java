package com.epam.training.student_Samvel_Danielyan.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int seconds = in.nextInt();
        int S = seconds % 60;
        int H = seconds / 60;
        int M = H % 60;
        H = (H / 60) % 24;
        System.out.print( H + ":" + String.format("%02d", M) + ":" + String.format("%02d", S));
    }
}
