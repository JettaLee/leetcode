import java.util.ArrayList;
import java.util.List;

/**
 * @author Li Jingwei
 * @date 2019/8/22 下午5:21
 */
public class Subsets {
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(result,nums,new ArrayList<>(),0);
        return result;
    }


    private void backtrack(List<List<Integer>> result, int[] nums, List<Integer> tmp, int index){
        result.add(new ArrayList<>(tmp));
        for(int i = index;i<nums.length;i++){
            tmp.add(nums[i]);
            backtrack(result,nums,tmp,i+1);
            tmp.remove(tmp.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> subsets = new Subsets().subsets(nums);
        System.out.println();
    }
}
