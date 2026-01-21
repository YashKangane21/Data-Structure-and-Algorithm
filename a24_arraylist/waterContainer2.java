// 2 Pointer Approach 
// O(n)

package a24_arraylist;
import java.util.ArrayList;
public class waterContainer2 {
    public static void bigContainer(ArrayList<Integer> height){
        int max = 0;
        int l = 0;
        int r = height.size() - 1;

        while(l < r){
            int l1 = height.get(l);
            int l2 = height.get(r);

            int ht = Math.min(l1, l2);
            int width = r-l;

            int curr = ht * width;
            max = Math.max(max, curr);

            
            if(l1 < l2){
                l++;
            }else{
                r--;
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
