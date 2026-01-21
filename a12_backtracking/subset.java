package a12_backtracking;

public class subset {
    public static void subSet(String str, String ans, int i){
        // base case
        if(i == str.length()){
            if(str.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //yes
        subSet(str, ans+str.charAt(i), i+1);
        //no
        subSet(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "yash";
        subSet(str, "", 0);
    }
}
