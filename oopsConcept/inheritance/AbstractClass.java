package oopsConcept.inheritance;

public class AbstractClass {
    public static void main(String[] args) {
        horse h = new horse();
        // h.walk();

        // System.out.println();
        // hen h1 = new hen();
        // h1.walk();
    }
}
// we can't create object of abstract class
// it contains both abstract as well as non abstract methods

abstract class animal{
    animal(){
        System.out.println("constructor of abstract class called....");
    }
    abstract void walk(); // only method decalration 
}
class horse extends animal{
    horse(){
        System.out.println("constructor of horse class called....");
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class hen extends animal{
    hen(){
        System.out.println("constructor of hen class called....");
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}