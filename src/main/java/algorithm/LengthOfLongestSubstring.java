package algorithm;

import java.util.HashMap;

/**
 * @author: Li Jingwei
 * @date: 2020/03/24 15:36
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap();
        char[] chars = s.toCharArray();
        int maxL = 0,tmp = 0, start = 0;
        for(int i = 0; i<chars.length; i++){
            if(!map.containsKey(chars[i])) {
                tmp++;
            } else {
                /**
                 * start for "abba" case
                 */

                start = Math.max(start, map.get(chars[i]));
                tmp = i - start;
            }
            maxL = Math.max(tmp, maxL);
            map.put(chars[i],i);
        }
        return maxL;
    }

    public static void main(String[] args) {
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("abba"));
    }
}
