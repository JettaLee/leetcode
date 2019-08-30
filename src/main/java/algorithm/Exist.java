package algorithm;

/**
 * @author Li Jingwei
 * @date 2019/8/30 下午5:24
 */
public class Exist {
    private boolean[][] location;
    public boolean exist(char[][] board, String word) {
        location = new boolean[board.length][board[0].length];
        for(int i = 0; i< board.length; i++){
            for(int j = 0; j< board[0].length; j++){
                if(backtrack(board, location, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtrack(char[][] board, boolean[][] location, String word, int i, int j, int len) {
        if(len == word.length()) {
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>= board[0].length || location[i][j] || board[i][j] != word.charAt(len)) return false;
        location[i][j] = true;
        if(backtrack(board, location, word, i-1, j, len+1) ||
                backtrack(board, location, word, i+1, j, len+1) ||
                backtrack(board, location, word, i, j+1, len+1) ||
                backtrack(board, location, word, i, j-1, len+1)) return true;
        location[i][j] = false;
        return false;
    }

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        board[0][0] = 'C';
        board[0][1] = 'A';
        board[0][2] = 'A';
        board[1][0] = 'A';
        board[1][1] = 'A';
        board[1][2] = 'A';
        board[2][0] = 'B';
        board[2][1] = 'C';
        board[2][2] = 'D';
        boolean aaa = new Exist().exist(board, "AAA");
        System.out.println();
    }
}