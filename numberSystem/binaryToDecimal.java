package numberSystem;

public class binaryToDecimal {
    public static int convertBtD(int n){
        int ans = 0;
        int i = 0;

        while(n > 0){
            int rem = n % 10;
            ans += rem * (int)Math.pow(2, i);
            i++;
            n /= 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(convertBtD(111));
    }
}
