import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        // display all numbers entered by user except multiple of 10
        Scanner sc = new Scanner(System.in);
        int n;
        do { 
            System.out.print("Enter Number : ");
            n = sc.nextInt();

            if(n%10 == 0){
                continue;
            }
            System.out.println(n);
        } while (true);
    }
}
