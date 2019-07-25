/**
 * @author Li Jingwei
 * @date 2019/7/24 下午7:34
 */
public class ConvertToTitle {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while(n != 0) {
            n--;
            sb.append((char)('A'+(n%26)));
            n/=26;
        }
        return sb.reverse().toString();
    }

    public int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        int times = 1;
        for(int i = chars.length-1;i>=0;i--){
            sum += (chars[i]-'A'+1)*times;
            times*=26;
        }
        return sum;
    }

}
