package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if (!(array.length==0)) {
            int x = array[array.length - 1], i;
            for (i = array.length - 1; i > 0; i--)
                array[i] = array[i - 1];
            array[0] = x;
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if(!(array.length==0)){
            for (int i = 0; i < shift; i++) {
                int j, last;
                last = array[array.length - 1];

                for (j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = last;
            }
        }
    }
}
