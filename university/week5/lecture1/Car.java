package edu.zuj.oop.week5.lecture1;

public class Car {
    //attributess--->instance variables 
    //(variables on the class level)
    String type;
    int year;
    
    public void turnOn(){
        System.out.println("Truning on "+type+" with model "+year);
    }
    
    public void turnOff(){
        System.out.println("Truning off "+type+" with model "+year);
    }    
    
    public void moveForward(){
        System.out.println("Move "+type+" with model "+year+" forward");
    }    

    public void moveBackword(){
        System.out.println("Move "+type+" with model "+year+" backword");
    }    
    
    public void stop(){
        System.out.println("Stopping "+type+" with model "+year);
    }    


    
}
