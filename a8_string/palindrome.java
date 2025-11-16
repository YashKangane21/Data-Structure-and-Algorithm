public class palindrome {
    public static void main(String[] args) {
        String str = "racecar";

        int n = str.length() - 1;
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(n-i)){
                System.out.println("not palindrome");
                return;
            }
        }
        System.out.println("palindrome");
    }
}
