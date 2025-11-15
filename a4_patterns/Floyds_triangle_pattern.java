package a4_patterns;

public class Floyds_triangle_pattern {
    public static void main(String[] args) {
        // int n = 5;
        // int m = 1;
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<=i; j++){
        //         System.out.print(" " + m);
        //         m++;
        //     }
        //     System.out.println();
        // }

        int num = 1;
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num++ + " ");
            }
            System.out.println();
        }

    }
}
