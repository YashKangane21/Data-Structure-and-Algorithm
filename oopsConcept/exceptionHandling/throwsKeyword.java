package oopsConcept.exceptionHandling;

public class throwsKeyword {
    public static void divideByZero(int n) throws ArithmeticException{
        int m = n/0;
        System.out.println(m);
    }
    public static void main(String[] args) {
        System.out.println("before exception.....");

        // divideByZero(6);
        try {
            divideByZero(5);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("after exception.....");
    }
}
