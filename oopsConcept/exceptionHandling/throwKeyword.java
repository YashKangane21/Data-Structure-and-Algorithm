package oopsConcept.exceptionHandling;
import java.util.Scanner;
public class throwKeyword {
    public static void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("You can't drive and vote");
        }
        System.out.println("You can drive and vote");
    }
    public static void main(String[] args) {
        int age;
        System.out.print("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        
        System.out.println("before exception.........");
        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("after exception.........");


    }
}
