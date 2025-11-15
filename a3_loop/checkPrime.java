import java.util.*;
public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();

        boolean isPrime = true;

        if(n == 1){
            System.out.println("Not Prime");
            return;
        }
        for(int i=2; i<= Math.sqrt(n); i++){
            if(n%i == 0){
                isPrime = false;
            }
        }

        if(isPrime == true){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
