package oopsConcept.inheritance;

public class multiLevel {
    public static void main(String[] args) {
        Frog f1 = new Frog();
        f1.sound();
        f1.canLive();
        f1.eat();
        f1.breathe();
    }
}
class Animal{
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Amphibians extends Animal{
    void canLive(){
        System.out.println("can live both under water and on land");
    }
}
class Frog extends Amphibians{
    void sound(){
        System.out.println("Croak");
    }
}
