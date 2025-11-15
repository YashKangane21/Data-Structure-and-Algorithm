import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do { 
            System.out.print("Enter number :");
            n = sc.nextInt();
            
            if(n%10 == 0){
                break;
            }
        } while (true);
    }
}
