package oopsConcept.exceptionHandling;

public class tryCatchFinally {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println("Before Exception...");
        try {
            // int n = 5/0;
            System.out.println(arr[5]);  
        }
        // catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e){
        //     System.out.println(e.getMessage());
        // } 
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
        finally{
            System.out.println("This is finally block");
        }
        System.out.println("After Exception...");
    }
}
