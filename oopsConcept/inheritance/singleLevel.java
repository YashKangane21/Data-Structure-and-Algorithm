package oopsConcept.inheritance;

public class singleLevel {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.sound();
        d1.eat();
        d1.breathe();
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class dog extends Animal{
    void sound(){
        System.out.println("dog barks");
    }
}
