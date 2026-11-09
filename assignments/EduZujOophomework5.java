package edu.zuj.oop;
//Comprehensive Unit Converter Menu Program

import java.util.Scanner;


public class EduZujOophomework5 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the value you want to convert:");
        double v=s.nextDouble();
        System.out.println("===================");
        System.out.println("=====menu==========");
        System.out.println("===================");
        System.out.println("1. Inches to Centimeters");
        System.out.println("2. Centimeters to Inches");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Celsius to Fahrenheit");
        System.out.println("6. Fahrenheit to Celsius");
        System.out.println("7. Hectare to Denum (Dunum)");
        System.out.println("8. Denum (Dunum) to Hectare");
        System.out.println("===================");
        
        int ch=s.nextInt();
        double result;
                
        switch(ch){
            case 1:
                result = v* 2.54;
                System.out.println(result);
                break;
                case 2:
                result = v / 2.54;
                System.out.println(result);
                break;
            case 3:
                result = v * 0.3048;
                System.out.println(result);
                break;
            case 4:
                result = v * 3.28084;
                System.out.println(result);
                break;
            case 5:
                result = (v * 9.0 / 5.0) + 32;
                System.out.println(result);
                break;
            case 6:
                result = (v - 32) * 5.0 / 9.0;
                System.out.println(result);
                break;
            case 7:
                result = v * 10.0;
                System.out.println(result);
                break;
            case 8:
                result = v / 10.0;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid choice");
                
            
            
            
            
        }
           
                

        
                    
                    
                    
        
        
        
        
        
        
        
    }
    
}
