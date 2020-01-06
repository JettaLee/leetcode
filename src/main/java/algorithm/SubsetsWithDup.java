package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Li Jingwei
 * @date 2020/1/3 上午10:42
 */
public class SubsetsWithDup {
    //正向组装
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> emptyList = new ArrayList<>();
        result.add(emptyList);
        Arrays.sort(nums);
        int i = 0;
        while (i<nums.length) {
            int dupTime = 0;
            while(i+1<nums.length && nums[i] == nums[i+1]) {
                i++;
                dupTime++;
            }
            int prevNum = result.size();
            for (int k = 0; k<prevNum;k++) {
                List<Integer> list = new ArrayList<>(result.get(k));
                for(int j = 0; j<=dupTime;j++) {
                    list.add(nums[i]);
                    result.add(new ArrayList<>(list));
                }
            }
            i++;
        }
        return result;

    }

    //回溯
    public List<List<Integer>> subsetsWithDup2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> emptyList = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(result,new ArrayList<Integer>(), nums, 0);
        return result;
    }

    void backtrack(List<List<Integer>> result, List<Integer> tmp,int[] nums, int i) {
        if(i <= nums.length) result.add(new ArrayList<>(tmp));
        while(i<nums.length) {
            tmp.add(nums[i]);
            backtrack(result, tmp, nums, i+1);
            tmp.remove(tmp.size()-1);
            while(i+1<nums.length && nums[i]==nums[i+1])i++;
            i++;
        }
    }


        public static void main(String[] args) {
        List<List<Integer>> lists = new SubsetsWithDup().subsetsWithDup2(new int[] { 1, 2, 2 });
        System.out.println();
    }


}
