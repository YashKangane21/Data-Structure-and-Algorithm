package conditionalStatement;
import java.util.Scanner;
public class incomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double income;
        double tax;

        System.out.print("Enter your income :");
        income = sc.nextDouble();
        
        if(income < 500000){
            tax = 0;
        }else if(income <1000000 && income >= 500000){
            tax = (income*  20)/100;
        }else{
            tax = (income * 30)/100;
        }
        System.out.println("Income tax :" + tax);
    }
}
