/**
 * @author Li Jingwei
 * @date 2019/8/9 上午11:32
 */
public class SortColors {

    public void sortColors(int[] nums) {
        if(nums == null || nums.length <= 1) return;
        int start = 0, end = nums.length-1,i = start;
        while (i<=end){
            if(nums[i] == 0) {
                switchValue(nums, start++, i++);
                continue;
            }
            if(nums[i] == 2) {
                switchValue(nums, end--, i);
                continue;
            }
            i++;
        }
    }

    private void switchValue(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = {0,0};
        new SortColors().sortColors(nums);
    }
}