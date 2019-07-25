/**
 * @author Li Jingwei
 * @date 2019/7/24 下午7:15
 */
public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int i = 0, j = numbers.length-1;
        while(true) {
            if(numbers[i] + numbers[j] > target) {
                j--;
                continue;
            }
            if(numbers[i] + numbers[j] < target) {
                i++;
                continue;
            }
            break;
        }
        ans[0] = i+1;
        ans[1] = j+1;

        return ans;
    }

}
