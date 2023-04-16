package com.epam.training.student_Samvel_Danielyan.arrays;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array){
        int j = 2;
        boolean[] arr = new boolean[array.length];
        arr[0] = false;
        arr[1] = false;

        for(int i = 2; i<array.length; i++){
            if(array[j] == array[j-1] + array[j-2]){
                arr[j] = true;
            }
            else {
                arr[j] = false;
            }
            j++;
        }
        return arr;
    }
}
