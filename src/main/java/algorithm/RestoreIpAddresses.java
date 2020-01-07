package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Li Jingwei
 * @date 2020/1/7 下午2:19
 * 相对EZ，漏了这条判定 if(i>1 && s.charAt(0) == '0') return;

 */
public class RestoreIpAddresses {

    private List<String> result = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        backtrack(new ArrayList<String>(), s);
        return result;
    }

    void backtrack(List<String> tmp, String s) {
        if(s.length() == 0 || tmp.size() == 4) {
            if(s.length() == 0 && tmp.size() == 4) {
                result.add(String.join(".",tmp));
            }
            return;
        }
        for(int i = 1;i<4;i++){
            if(s.length()>=i && Integer.valueOf(s.substring(0,i))<=255){
                if(i>1 && s.charAt(0) == '0') return;
                tmp.add(s.substring(0,i));
                backtrack(tmp, s.substring(i));
                tmp.remove(tmp.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        List<String> strings = new RestoreIpAddresses().restoreIpAddresses("010010");
        System.out.println();
    }
}
