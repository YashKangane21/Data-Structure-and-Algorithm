// brute force approate 
// O(n^2)

package a24_arraylist;
import java.util.ArrayList;
public class waterContainer1 {

    public static void bigContainer(ArrayList<Integer> height){
        int max = 0;
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;

                int currSize = ht * width;
                max = Math.max(max, currSize);
            }
        }

        System.out.println(max);
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        bigContainer(height);

    }
}
