// sorted and rotated array
import java.util.ArrayList;
public class pairSum2 {
    public static void pairSum(ArrayList<Integer> list, int target){
        //[11, 15, 6, 8, 9, 10]
        int st = 0;
        int end = 0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                st = i+1;
                end = i;
                break;
            }
        }
        while(st != end){
            if(list.get(st) + list.get(end) == target){
                System.out.println(st + ", " + end);
                return;
            }
            else if(list.get(st) + list.get(end) > target){
                end = (list.size() + end - 1)%list.size();
            }else{
                st = (st + 1)%list.size();
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        pairSum(list, target);
    }
}
