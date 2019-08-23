package algorithm;

import java.util.Arrays;

/**
 * @author Li Jingwei
 * @date 2019/7/24 下午8:13
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];

    }
}
