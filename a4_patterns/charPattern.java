package a4_patterns;

public class charPattern {
    public static void main(String[] args) {
        char ch = 'A';
        // System.out.println(ch);
        int n = 4;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
