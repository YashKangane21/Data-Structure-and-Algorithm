public class largestString {
    public static void main(String[] args) {
        String fruits[] = {"Apple","Mango", "banana","orange","Gauva"};

        String largest = fruits[0];
        for(int i=0; i<fruits.length; i++){
            if(fruits[i].compareToIgnoreCase(largest) > 0){
                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }
}
