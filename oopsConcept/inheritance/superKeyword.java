package oopsConcept.inheritance;

public class superKeyword {
    public static void main(String[] args) {
        bike b1 = new bike();
        b1.fuel();
    }
}
class vehicle{
    vehicle(){
        System.out.println("vehicle constructor called.......");
    }
    void fuel(){
        System.out.println("Vehicle needs fuel");
    }
}
class bike extends vehicle{
    bike(){
        super();
        System.out.println("bike constructor called.......");
    }
    void fuel(){
        super.fuel();
        System.out.println("Bike uses petrol");
    }
}
