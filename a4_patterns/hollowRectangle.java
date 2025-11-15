package a4_patterns;

public class hollowRectangle {
    public static void main(String[] args) {

        // int n = 4; // row
        // int m = 9; // column

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=m; j++){
        //         if(i==1 || i==n || j==1 || j==m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        int n = 4;  //column
        int m = 7;  //row
        for(int i = 1; i<=n ; i++){
            for(int j=1; j<=m; j++){
                if(i == 1 || i == n || j == 1 || j == m){
                    System.out.print("* ");
                }else{ 
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
