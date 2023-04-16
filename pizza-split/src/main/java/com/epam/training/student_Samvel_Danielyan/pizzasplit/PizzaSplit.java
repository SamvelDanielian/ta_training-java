package com.epam.training.student_Samvel_Danielyan.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfPeople = sc.nextInt();
        int numOfPiecesPerPizza = sc.nextInt();
        int numOfPizza;

        for (numOfPizza = 1; ; numOfPizza++) {
            if((numOfPizza*numOfPiecesPerPizza)%numOfPeople==0){
                break;
            }
        }
        System.out.println(numOfPizza);

    }
}
