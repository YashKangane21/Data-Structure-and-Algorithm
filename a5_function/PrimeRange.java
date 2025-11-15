package a5_function;

public class PrimeRange {
    public static void primeNumbers(int n){
        for(int i=2; i<=n; i++){
            boolean isPrime = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        primeNumbers(100);
    }
}
