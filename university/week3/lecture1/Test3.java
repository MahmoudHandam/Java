package edu.zuj.oop.week3.lecture1;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter max number: ");
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                System.out.println(i+" is even");   
            }            
        }
    }
}
