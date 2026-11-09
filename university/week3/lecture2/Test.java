package edu.zuj.oop.week3.lecture2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of values: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter value "+(i+1)+" :");
            arr[i]=s.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("=================================");
        System.out.println("Sum = "+sum);
        System.out.println("=================================");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
