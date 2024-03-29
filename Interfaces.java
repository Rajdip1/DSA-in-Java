
interface Animal {
    int eye = 2;
    void walk();
}

interface Herbivore {

}

class Horse implements Animal,Herbivore {
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

public class Interfaces {
    public static void main(String[] args){
        Horse horse = new Horse();
        horse.walk();
    }
}
