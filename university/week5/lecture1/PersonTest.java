package edu.zuj.oop.week5.lecture1;

public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="Ata";
        p1.age=20;
        
        Person p2=new Person();
        p2.name="Jamal";
        p2.age=25;
        
        p1.talk();
        p2.talk();
    }
}
