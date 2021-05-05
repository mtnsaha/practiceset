package com.test;

public class Test3 {

    public static void main(String[] args) {
        int[] arr = {24, 66, 2, 11, 45, 21, 78, 26, 9, 54};
        int[] arr2 = new int[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"->");
        }
        System.out.println("");

        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i != 4) {
                arr2[k] = arr[i];
                k++;
            }

        }

        for (int i = 0; i < arr2.length; i++) {

            System.out.print(arr2[i]+"->");
        }

    }
}
