public class shortestPath {
    public static void main(String[] args) {
        // E = east, W = west, N = north, S = south

        int x = 0;
        int y = 0;
        String str = "WNEENESENNN";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'E'){
                x++;
            }
            else if(str.charAt(i) == 'W'){
                x--;
            }
            else if(str.charAt(i) == 'N'){
                y++;
            }
            else if(str.charAt(i) == 'S'){
                y--;
            }
        }
        System.out.println("x : "+ x);
        System.out.println("y : "+ y);

        double disp = Math.pow(x,2) + Math.pow(y,2);
        double path = Math.sqrt(disp);
        System.out.println("Shortest Path : " + path);
        
    }
}
