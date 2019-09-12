package algorithm;

/**
 * @author Li Jingwei
 * @date 2019/9/12 下午4:03
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int index = 0, settle = 0;
        while(index < nums.length) {
            if(check(nums,index,settle)){
                nums[settle++] = nums[index++];
            } else {
                index++;
            }
        }
        return settle;
    }

    private boolean check(int[] nums, int index, int settle) {
        if(index < 2) return true;
        if(nums[index] != nums[settle-1]) return true;
        if(nums[index] == nums[settle-1] && nums[settle-1] != nums[settle-2]) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,3,3,3,3};
        System.out.println(new RemoveDuplicates().removeDuplicates(nums));
        System.out.println();
    }
}
