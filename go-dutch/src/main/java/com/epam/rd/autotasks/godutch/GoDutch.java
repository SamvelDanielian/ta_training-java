package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalAmount = sc.nextInt();
        int numberOfFriends = sc.nextInt();
        int totalAmountWithTips = totalAmount + totalAmount/10;

        if(totalAmount<0){
            System.out.println("Bill total amount cannot be negative");
        }
        else if (numberOfFriends<=0){
            System.out.println("Number of friends cannot be negative or zero");
        }
        else {
            System.out.println(totalAmountWithTips / numberOfFriends);
        }
    }
}
