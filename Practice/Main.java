package Practice;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("ello");
        sb.append(" world ");
        sb.insert(0,'h');
        sb.delete(1,3);
        System.out.println(sb);
    }
}

