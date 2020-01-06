package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Li Jingwei
 * @date 2019/10/10 上午11:31
 */
public class GrayCode {

    private List<Integer> result = new ArrayList<>();

    public List<Integer> grayCode(int n) {
        List<Integer> rs=new ArrayList<Integer>();
        rs.add(0);
        for(int i=0;i<n;i++){
            int size=rs.size();
            for(int k=size-1;k>=0;k--)
                rs.add(rs.get(k) | 1<<i);
        }
        return rs;
    }
    public List<Integer> grayCode2(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(0);
        for(int i = 0;i<n;i++) {
            for(int j = (1<<i)-1;j>=0;j--){
                res.add(res.get(j)+(1<<i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> integers = new GrayCode().grayCode2(2);
        System.out.println();
    }

}