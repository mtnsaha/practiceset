package com.test;

import java.util.logging.Logger;

public class Test2 {
    public static void main(String[] args) {

        Logger logger= Logger.getLogger("Test2.class");

        int[] arr={2,8,9,44,76,19,44};
        int[] arr2=new int[arr.length];

        for (int i=0;i<4;i++){
            if(arr[i]!=8){

                arr2[i]=arr[i];
            }

        }

        for (int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]+"->");
        }





    }
}
