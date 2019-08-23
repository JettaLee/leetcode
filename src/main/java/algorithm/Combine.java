package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Li Jingwei
 * @date 2019/8/9 下午4:23
 */
public class Combine {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtrack(new ArrayList<Integer>(), n, k);
        return result;
    }

    private void backtrack(List<Integer> list, int n, int k){
        if(list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }
        int start = list.size()==0 ? 1 : list.get(list.size()-1)+1;
        for (int i = start; i<=n;i++){
            list.add(i);
            backtrack(list,n,k);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> combine = new Combine().combine(5, 3);
        System.out.println();
    }
}