package conditionalStatement;
public class larger2 {
    public static void main(String[] args) {
        int a = 60;
        int b = 90;
        int c = 30;

        if(a>b && a>c){
            System.out.println(a);
        }else if(b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
