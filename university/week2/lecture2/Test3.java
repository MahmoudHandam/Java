package edu.zuj.oop.week2.lecture2;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter temp in cels: ");
        int temp=s.nextInt();
        double feh=(temp* 1.8)+32;
        
        System.out.println("Temp in F = "+feh);
    }
}
