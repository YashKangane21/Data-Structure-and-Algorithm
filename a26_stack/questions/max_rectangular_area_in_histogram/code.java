package a26_stack.questions.max_rectangular_area_in_histogram;
import java.util.Stack;
public class code {
    public static int maxAreaInHistogram(int heights[]){
        int n = heights.length;
        int nextSmall[] = new int[n];
        int prevSmall[] = new int[n];
        Stack<Integer> s = new Stack<>();

        //next smaller
        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmall[i] = n;
            }else{
                nextSmall[i] = s.peek();
            }
            s.push(i);
        }

        //previous smaller

        s = new Stack<>();

        for(int i=0; i<n; i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                prevSmall[i] = -1;
            }else{
                prevSmall[i] = s.peek();
            }
            s.push(i);
        }

        //max area
        int maxArea = 0;
        for(int i=0; i<n; i++){
            int height = heights[i];
            int width = nextSmall[i] - prevSmall[i] - 1;

            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int heights[] = {2,1,5,6,2,3};
        System.out.println(maxAreaInHistogram(heights));
    }
}
