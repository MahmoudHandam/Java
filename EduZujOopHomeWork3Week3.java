
package edu.zuj.oop;
//// Program: Find Max, Min, Sum, Average, and re-print numbers

import java.util.Scanner;

public class EduZujOopHomeWork3Week3 {
    public static void main(String[] args) {
                Scanner s= new Scanner(System.in);

        System.out.print("Enter how many  (number you will use ): ");
        int n =s.nextInt();
        double arr[]=new double[n];
        double m=0,min=arr[0],sum=0,avg;
        
        //array input
        for (int i = 0; i < n; i++) {arr[0+i]=s.nextDouble();}
        //max number 
        for (int i = 0; i < n; i++) {
            if(m<arr[i]){
                m=arr[i];        
            }
        }
        //min number
        for (int i = 0; i < n; i++) {
            if(min>arr[i]){
               min=arr[i]; 
            }
        }
        //sum 
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            
            
        }
     
        System.out.println("max="+m);
        System.out.println("min="+min);
        System.out.println("sum="+sum);
        System.out.println("avg="+(sum/n));    
        
        
            
        
        
        
        

    }
}
