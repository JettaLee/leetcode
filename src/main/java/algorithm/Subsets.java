package algorithm;

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

    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> output = new ArrayList();
        output.add(new ArrayList<Integer>());

        for (int num : nums) {
            List<List<Integer>> newSubsets = new ArrayList();
            for (List<Integer> curr : output) {
                newSubsets.add(new ArrayList<Integer>(curr){{add(num);}});
            }
            output.addAll(newSubsets);
        }
        return output;
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
        for(int i = (1<<3);i<(1<<4);i++) {
            System.out.println(Integer.toBinaryString(i).substring(1));
        }
    }
}
