package oopsConcept.inheritance;

public class methodOverloading {
    int sum(int a, int b){
        return a+b;  
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    double sum(double a, double b){
        return a+b;  
    }
    double sum(double a, double b, double c){
        return a+b+c;
    }
    public static void main(String[] args) {
        methodOverloading obj = new methodOverloading();
        System.out.println(obj.sum(1,2));
        System.out.println(obj.sum(1,2,3));
        System.out.println(obj.sum(1.0,2));
        System.out.println(obj.sum(1,2,3.0));
    }
}
