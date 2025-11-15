import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius :");
        float r = sc.nextFloat();
        
        float Area = 3.14f * r * r;
        System.out.println("Area of circle is " + Area);
    }
}
