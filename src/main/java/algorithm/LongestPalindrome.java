package algorithm;

/**
 * @author: Li Jingwei
 * @date: 2020/03/24 16:28
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s.length() < 2) return s;
        char[] chars = s.toCharArray();
        int start = 0, end = 0, max = 1;
        int len = 0;
        for(int i = 0;i<s.length()-1;i++){
            //这里需要把len置0
            len = 0;
            while((i-len>=0) && (i+len<s.length()) && chars[i-len] == chars[i+len]) len++;
            if(max<len*2-1) {
                max = len*2-1;
                start = i-len+1;
                end = i+len-1;
            }
            len = 0;
            while((i-len>=0) && (i+len+1<s.length()) && chars[i-len] == chars[i+len+1]) len++;
            if(max<len*2) {
                max = len*2;
                start = i-len+1;
                end = i+len;
            }
        }
        return s.substring(start,end+1);

    }

    public static void main(String[] args) {
        new LongestPalindrome().longestPalindrome("fkwwkkf");
    }
}
