package algorithm;

/**
 * @author Li Jingwei
 * @date 2020/1/6 下午3:34
 * 这道题要重点掌握
 */
public class NumDecodings {
    //辣鸡递归没前途
    public int numDecodings(String s) {
        if(s.charAt(0) == '0' || s.length()>1 && s.charAt(1) == '0' && s.charAt(0) > '2') return 0;
        if(s.length()<3){
            if(s.length() ==2 && Integer.parseInt(s.substring(0,2))<27 && s.charAt(1) != '0'){
                return 2;
            }
            return 1;
        }
        if(s.charAt(1)=='0') return numDecodings(s.substring(2));
        if(s.charAt(2)=='0') return numDecodings(s.substring(1));
        if(Integer.parseInt(s.substring(0,2))<27) return numDecodings(s.substring(1))+numDecodings(s.substring(2));
        return numDecodings(s.substring(1));
    }

    public int numDecodings2(String s) {
        int length = s.length();
        int[] ans = new int[length+1];
        ans[0] = 1;
        ans[1] = s.charAt(0) == '0'? 0 : 1;
        for(int i = 2;i<=length;i++) {
            if(s.charAt(i-1)>='1'&& s.charAt(i-1)<= '9') ans[i] += ans[i-1];
            Integer two = Integer.valueOf(s.substring(i - 2, i));
            if(two >= 10 && two <=26) ans[i] += ans[i-2];
        }
        return ans[length];
    }

    public static void main(String[] args) {
        String s = "17";
        int i = new NumDecodings().numDecodings2(s);
        System.out.println();
    }
}
