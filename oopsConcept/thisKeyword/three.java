// call default constructor through parametrised constructor

package oopsConcept.thisKeyword;

public class three {
    three(){
        System.out.println("call default constructor through parametrised constructor");
    }
    three(int a){
        this();
    }
    public static void main(String[] args) {
        three obj = new three(100);
    }
}
