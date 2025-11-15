public class reverseNum {
    public static void main(String[] args) {
        int n = 123;
        int m = n;
        int ans = 0;
        int rem = 0;

        while(m > 0){
            rem = m%10;
            ans = ans*10 + rem;
            m = m/10;
        }
        System.out.print(ans);
    }
}
