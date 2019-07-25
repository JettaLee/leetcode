/**
 * @author Li Jingwei
 * @date 2019/7/25 上午10:34
 */
public class TrailingZeroes {
    public int trailingZeroes(int n) {
        int sum = 0;
        while(n !=0){
            sum += n/5;
            n/=5;
        }
        return sum;
    }
}
