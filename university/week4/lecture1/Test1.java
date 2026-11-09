package edu.zuj.oop.week4.lecture1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*1000);
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double avg=sum/arr.length;
        System.out.println("Sum = "+sum);
        System.out.println("Avg = "+avg);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
