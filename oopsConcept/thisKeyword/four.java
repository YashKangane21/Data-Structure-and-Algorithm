// call parametrised constructor through default constructor

package oopsConcept.thisKeyword;

public class four {
    four(){
        this(10);
    }
    four(int a){
        System.out.println("call parametrised constructor through default constructor");
        System.out.println(a);
    }
    public static void main(String[] args) {
        four obj = new four();
    }
}
