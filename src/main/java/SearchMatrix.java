/**
 * @author Li Jingwei
 * @date 2019/8/8 下午4:55
 */
public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        for(int i = matrix.length-1; i >= 0 ; i--) {
            if(matrix[i][0] <= target) {
                for(int j = 0; j < matrix[0].length; j++){
                    if(matrix[i][j] == target) return true;
                }
            }
        }
        return false;
    }
}
