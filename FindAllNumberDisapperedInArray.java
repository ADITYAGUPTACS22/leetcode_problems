
/**
 * FindAllNumberDisapperedInArray
 */
import java.util.*;

public class FindAllNumberDisapperedInArray {

    public static void problem(int nums[] ,List<Integer> ll){
        for (int i = 0; i < nums.length; i++) {
            int idx=Math.abs(nums[i])-1;

            if(nums[idx]<0){
                continue;
            }

            nums[idx] *= -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                ll.add(i+1);
            }
        }

    }

    public static void main(String[] args) {
        List<Integer> ll=new ArrayList<>();
        int nums[]={1,2,0};
        problem(nums, ll);
        System.out.println(ll);
    }
}