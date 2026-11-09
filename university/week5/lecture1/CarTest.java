package edu.zuj.oop.week5.lecture1;

public class CarTest {
    public static void main(String[] args) {
        int x=10;
        //Car: datatype
        //c1: varaible/ reference
        //new Car(): consrtuction        
       Car c1=new Car(); 
       c1.type="Mercedes";
       c1.year=2010;
       c1.turnOn();
       c1.moveForward();
       c1.stop();
       c1.turnOff();
       
       Car c2=new Car();
       c2.type="Toyota";
       c2.year=2015;
       c2.turnOn();
       c2.moveBackword();
       c2.stop();
       c2.turnOff();       
    }
}
