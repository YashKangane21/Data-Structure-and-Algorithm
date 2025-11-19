package oopsConcept.inheritance;

public class methodOverride {
    public static void main(String[] args) {
        cow c1 = new cow();
        c1.eat();
    }
}

class animal{
    void eat(){
        System.out.println("eats everything");
    }
}
class cow extends animal{
    @Override
    void eat(){
        System.out.println("eats grass");
    }
}
