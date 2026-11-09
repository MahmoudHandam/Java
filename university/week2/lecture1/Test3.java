package edu.zuj.oop.week2.lecture1;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //Scanner: datatype 
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1=s.nextInt();
        System.out.print("Enter number 2: ");
        int n2=s.nextInt();
        System.out.println("Result= "+(n1+n2));
    }
}