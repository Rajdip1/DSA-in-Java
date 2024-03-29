//Taking properties of class into another class, like nethods and etc.
//increasing reusabillty

class Shape { 
    // String color;

    public void area(){
        System.out.println("Displays are");
    }
}

class Triangle extends Shape{
    public void area(int length, int height){
        System.out.println(1/2*length*height);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int length, int height){
        System.out.println(1/2*length*height);
    }
}

class Circle extends Shape{
    public void area(int radius){
        System.out.println((3.14)*radius*radius);
    }
}

public class Inheritance {
    public static void main(String[] args){
        // Triangle t1 = new Triangle();
        // t1.color = "red";


    }
}
