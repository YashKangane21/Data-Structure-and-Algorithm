package a5_function;

public class methodOverloading2 {
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static double sum(double a, double b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1.21f,2.21f));
        System.out.println(sum(11.99999,21.9999));
    }
}
