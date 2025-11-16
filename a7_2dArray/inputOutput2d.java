package a7_2dArray;
import java.util.Scanner;
public class inputOutput2d {
    public static void main(String[] args) {
        int matrix[][] = new int[3][4];
        int n = matrix.length;      //row
        int m = matrix[0].length;   //column

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter "+ n*m + " elements");
        for (int i = 0; i < n; i++) {
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();         
            }
        }

        System.out.println("2D Array :");
        for (int i = 0; i < n; i++) {
            for(int j=0; j<m; j++){
                System.out.print( matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
