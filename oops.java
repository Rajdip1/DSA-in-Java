import java.io.*;
import java.util.*;

// import Bank.Bank;


class Pen{
    String color;
    String type; //ballpoint, gel

    public void write(){
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Students {
    String name;
    int age;
    static String school;

    public static void changeSchool(){
        school = "new school";
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Students(){
    //     System.out.println("constructor called");
    // }

    // Students(String name, int age){  //parameterized contructor
    //     this.name = name;
    //     this.age = age;
    // }

    Students(Students s2){ //copy constructor
        this.name = s2.name;
        this.age = s2.age;
    }

    Students(){
        
    }

}


abstract class Animal {
    abstract void walk();

    public void eats(){
        System.out.println("eating food");
    }

    Animal(){
        System.out.println("you are creating a new animal");
    }
}

class Horse extends Animal {
    Horse(){
        System.out.println("created a horse");
    }
    
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}
public class oops {
    public static void main(String[] args){
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";

        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "ballpoint";

        // pen1.printColor();
        // pen2.printColor();

        // Students s1 = new Students();
        // s1.name = "Mahesh";
        // s1.age = 23;

        // s1.printInfo();

        // Students s1 = new Students("Aman", 24);
        // s1.printInfo();

        // Students s1 = new Students();
        // s1.name = "aman";
        // s1.age = 24;

        // Students s2 = new Students(s1);
        // s1.printInfo();

        // Bank.Account account1 = new Bank.Account();
        // account1.name = "customer1";

        // Horse horse = new Horse();
        // horse.walk();
        // horse.eats();

        // Chicken c1 = new Chicken();
        // c1.walk();

        Students.school = "jjis";
        Students s1 = new Students();
        s1.name = "tony";
        System.out.println(s1.school);


    

    }
}
