package algorithm;

/**
 * @author Li Jingwei
 * @date 2019/9/12 下午4:25
 */
class Search {
    public boolean search(int[] nums, int target) {
        if(nums == null || nums.length ==0) return false;
        int index = 0;
        if(nums[index] == target) return true;
        if(nums[index] < target) {
            while (index < nums.length && nums[index] < target){
                index++;
            }
        } else {
            index = nums.length-1;
            while (index>=0 && nums[index] > target){
                index--;
            }
        }
        if(index<0 || index>=nums.length) return false;
        if(nums[index] == target) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        new Search().search(nums,0);
    }
}
