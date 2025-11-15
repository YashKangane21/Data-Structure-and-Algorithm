package a4_patterns;

public class halfPyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            // int k = 1;
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
