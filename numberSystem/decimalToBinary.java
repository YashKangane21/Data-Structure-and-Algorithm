package numberSystem;
public class decimalToBinary {
    public static int reverse(int ans){
        int ans2 = 0;
        int rem = 0;
        while(ans > 0){
            rem = ans % 10;
            ans2 = (ans2 * 10) + rem;
            ans/=10;
        }
        return ans2;
    }
    public static int decToBin(int n){
        int i = 0;
        int ans = 0;

        while(n>0){
            int rem = n%2;
            ans = ans + (rem * (int)Math.pow(10,i));
            n /= 2; 
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(decToBin(12));
    }
}
