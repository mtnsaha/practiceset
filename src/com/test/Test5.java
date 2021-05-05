package com.test;

import java.util.Scanner;

public class Test5 {

    public static void main(String[] args) {
        System.out.println("enter a no :");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int n = i;
        int j=n+1;
        int sum = 0;

        while (i != 0) {
            sum = sum + i % 10;
            i = i / 10;
        }
        System.out.println("sum of "+ n +" is "+sum);
        while ( n<j) {
            int k=j;
            int sum2=0;
            while (k != 0) {
                sum2 = sum2 + k % 10;
                k = k / 10;
            }
            if(sum*2==sum2){
                System.out.println("the output is :"+j +", and sum of "+28+ " is "+sum2);
               break;
            }
            j++;

        }


    }


}
