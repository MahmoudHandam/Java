package edu.zuj.oop.week4.lecture1;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int n1=readNumber("Enter n1: ");
        int n2=readNumber("Enter n2: ");
        System.out.println(n1+n2);
    }
    
    public static int readNumber(){
        int n=readNumber("Enter value: ");
        return n;
    }
    
    //public: visibility modifier
    //static: allow the method to be called using class name
    //int: datatype of return value
    //readNumber2: method name
    //msg: paramter
    //having two methods with the same name in the same class: method overloading
    public static int readNumber(String msg){
        Scanner s=new Scanner(System.in);
        System.out.print(msg);
        int value=s.nextInt();
        return value;
    }    
}
