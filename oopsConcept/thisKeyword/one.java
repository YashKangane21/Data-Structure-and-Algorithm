// referes to the same current object

package oopsConcept.thisKeyword;

public class one {
    public void show(){
        System.out.println(this);
    }
    public static void main(String[] args) {
        one obj = new one();
        System.out.println(obj);
        obj.show();
    }
}
