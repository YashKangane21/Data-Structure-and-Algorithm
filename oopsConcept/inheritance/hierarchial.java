package oopsConcept.inheritance;

public class hierarchial {
    public static void main(String[] args) {
        goat g1 = new goat();
        g1.eat1();
        g1.breathe();

        cat d1 = new cat();
        d1.eat1();
        d1.breathe();
    }
}
class Animal{
    void breathe(){
        System.out.println("breathes");
    }
}
class goat extends Animal{
    void eat1(){
        System.out.println("eats grass");
    }
}
class cat extends Animal{
    void eat1(){
        System.out.println("eats chicken");
    }
}
