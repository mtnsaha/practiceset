package com.test;

public class Test4 {

    public static void main(String[] args) {
        int[] arr = {24, 24, 9, 54, 66, 2, 11, 45, 21, 78, 21, 66, 26, 9, 54};
        int[] temp = new int[arr.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "->");
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp[k] = i;
                    k++;
                }

            }
        }

        for (int i = 0; i < arr.length - k; i++) {
            for (int j = 0; j < k; j++) {
                if (i != temp[j]) {


                }


            }

        }

    }
}




