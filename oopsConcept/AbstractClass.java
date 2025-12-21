package oopsConcept;

public class AbstractClass {
    public static void main(String[] args) {
        helicompter h1 = new helicompter();
        h1.move();

        car c1 = new car();
        c1.move();

        train t1 = new train();
        t1.move();
    }
}
abstract class vehicle{
    abstract void move();
}
class helicompter extends vehicle{
    void move(){
        System.out.println("the Helicompter flies in air");
    }
}
class car extends vehicle{
    void move(){
        System.out.println("the Car drives on road");
    }
}
class train extends vehicle{
    void move(){
        System.out.println("the Train runs on track");
    }
}