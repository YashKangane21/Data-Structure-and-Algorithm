import java.util.Scanner;
public class inputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name :");
        String Fname = sc.next();
        System.out.println(Fname);
        
        System.out.println(Fname.length());
        sc.nextLine();

        System.out.print("Enter Full Name :");
        String Fullname = sc.nextLine();
        System.out.println(Fullname);
        
        System.out.println(Fullname.length());

    }
}
