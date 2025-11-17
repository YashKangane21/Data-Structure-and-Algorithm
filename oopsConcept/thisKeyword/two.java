//  use to refer current class instance variable

package oopsConcept.thisKeyword;

public class two {
    int a;
    two(int a){
        this.a = a;
    }
    void show (){
        System.out.println(a);
    }
    public static void main(String[] args) {
        two obj = new two(10);
        obj.show();

        two obj1 = new two(20);
        obj1.show();
    }
}
