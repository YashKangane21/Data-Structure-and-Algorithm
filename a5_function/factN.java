package a5_function;

public class factN {
    public static int fact_N(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        } 
        return fact;
    }
    // binomial coefficient
    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        // nCr = n!/r!*(n-r)!
        
        int factN = fact_N(n);
        int factR = fact_N(r);
        int factNmR = fact_N(n-r);

        int answer = factN / (factR * factNmR);
        System.out.println(answer);
    }

}
