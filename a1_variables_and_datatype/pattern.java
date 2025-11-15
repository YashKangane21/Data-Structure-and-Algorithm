public class pattern {
    public static void main(String[] args) {
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");
        int n = 4;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
