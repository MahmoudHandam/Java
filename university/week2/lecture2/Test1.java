package edu.zuj.oop.week2.lecture2;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1=s.nextInt();
        System.out.print("Enter n2: ");
        int n2=s.nextInt();
        if(n1>n2){
            System.out.println(n1 +" is bigger than "+n2);
        }else if(n2>n1){
            System.out.println(n2 +" is bigger than "+n1);
        } else {
            System.out.println(n1+" equals "+n2);
        }
        
    }
}
