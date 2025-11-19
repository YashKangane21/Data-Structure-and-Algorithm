package oopsConcept.constructor;

public class Student {
    int roll;
    String name;

    // non-parametrized constructor
    Student(){
        System.out.println("This is non-parametrized constructor");
    }
    // parametrized constructor
    Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
    void display(){
        System.out.println("Roll number of "+ name + " is "+ roll + ".");
    }
    public static void main(String[] args) {
        Student s1 = new Student(41, "Yash");
        s1.display();

        Student s2 = new Student();
    }
}
