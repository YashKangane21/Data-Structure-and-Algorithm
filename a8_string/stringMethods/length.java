package stringMethods;

import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Full Name :");
        String Fullname = sc.nextLine();
        System.out.println(Fullname);
        
        System.out.println("Length : "+Fullname.length());

    }
}
