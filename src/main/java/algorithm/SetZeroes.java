package algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Li Jingwei
 * @date 2019/7/26 下午5:36
 */
public class SetZeroes {
    public void setZeroes1(int[][] matrix) {
        if(matrix == null) return;
        int length = matrix.length;
        int width = matrix[0].length;
        Set<Integer> len = new HashSet<>();
        Set<Integer> wid = new HashSet<>();
        for(int i = 0;i<length;i++){
            for(int j = 0;j<width;j++){
                if(matrix[i][j] == 0) {
                    len.add(i);
                    wid.add(j);
                }
            }
        }
        len.forEach(i->{
            for(int j = 0;j<width;j++){
                matrix[i][j] = 0;
            }
        });
        wid.forEach(j->{
            for(int i = 0;i<length;i++){
                matrix[i][j] = 0;
            }
        });
    }

    public void setZeroes2(int[][] matrix) {
        if(matrix == null) return;

    }
}
