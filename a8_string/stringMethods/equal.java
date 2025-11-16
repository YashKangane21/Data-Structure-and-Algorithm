package stringMethods;

public class equal {
    public static void main(String[] args) {
        String s1 = "Yash";
        String s2 = "Yash";
        String s3 = new String("Yash");

        System.out.println(s1 == s2);       // prints true
        System.out.println(s1 == s3);       // prints false (it checks value + address)
        System.out.println(s1.equals(s3));  // printd true
    }
}
