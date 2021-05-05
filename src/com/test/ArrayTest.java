package com.test;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arrayint = {6, 8, 3, 55, 77, 0, 22, 22, 12, 76, 21, 4, 92, 13, 112, 24};
        int[] array2 = new int[arrayint.length];


        for (int i = 0; i < arrayint.length; i++) {

            for (int j = i + 1; j < arrayint.length; j++) {

                if (arrayint[i] == arrayint[j]) {

                } else if (arrayint[i] > arrayint[j]) {
                    int k = arrayint[i];
                    arrayint[i] = arrayint[j];
                    arrayint[j] = k;
                }


            }


        }
        for (int i = 0; i < arrayint.length; i++) {
            System.out.print(arrayint[i] + "->");
        }
    }


}
