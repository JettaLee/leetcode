package utils;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Li Jingwei
 * @date 2019/8/23 上午10:52
 */
public class FindMinGroup {

    private static List<Integer> resultArray;
    private static int resultSum = Integer.MAX_VALUE;

    public static void findMinGroup(int[] priceList, int sum) {
        backtrack(new ArrayList<>(), 0, priceList, 0, sum);
        System.out.println(resultSum);
        System.out.println(Arrays.toString(resultArray.toArray()));
    }

    private static void backtrack(List<Integer> result, int sum, int[] priceList, int index, int target) {
        if(sum >= target && sum < resultSum) {
            resultSum = sum;
            resultArray = new ArrayList<>(result);
            return;
        }
        for(int i = index; i < priceList.length; i++) {
            result.add(priceList[i]);
            backtrack(result, sum + priceList[i], priceList, i+1, target);
            result.remove(result.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] priceList = {50,100,143,143,109};
        findMinGroup(priceList, 900);
        System.out.println(JSONObject.toJSONString(resultArray));
    }
}
