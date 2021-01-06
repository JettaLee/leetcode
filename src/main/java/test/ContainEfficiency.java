package test;

import org.apache.commons.lang.RandomStringUtils;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Li Jingwei
 * @date 2019/11/4 下午5:17
 */
public class ContainEfficiency {

    private final static ArrayList<String> list = getList();

    private static ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>(200000);
        for(int i = 0; i<200000;i++) {
            list.add(RandomStringUtils.randomNumeric(10));
        }
        return list;
    }

    public static String convertDigits(String text) {
        String regex = "((?<=[第])[零一二三四五六七八九十百两千万亿]+(?=[期次个,季人名届集位章张轮部场关代节种周回]))" +
                "|((?<=[后这，])[零一二三四五六七八九十百两千万亿]+(?=个))|((?<=[后])[零一二三四五六七八九十百两千万亿]+(?=位))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String group = matcher.group();
            text = text.replaceFirst(regex, chiToDigits(group));
        }

        return text;
    }

    private static HashMap<String, Integer> chiNumMap = new HashMap<String, Integer>() {
        {
            put("零", 0);
            put("一", 1);
            put("二", 2);
            put("三", 3);
            put("四", 4);
            put("五", 5);
            put("六", 6);
            put("七", 7);
            put("八", 8);
            put("九", 9);
            put("十", 10);
            put("百", 100);
            put("两", 2);
        }

    };

    private static String chiToDigits(String text) {
        int total = 0;
        int carry = 1; // 进位
        char[] digits = text.toCharArray();
        int length = digits.length;

        int lastNum = 0;
        for (int i = length - 1; i >= 0; i--) {
            int num = chiNumMap.get(String.valueOf(digits[i]));

            if (num >= 10) {
                if (lastNum != 0) {
                    total *= num / 10 / carry;
                }
                carry = num;
                if (i == 0) {
                    total += carry;
                }
            } else {
                total += num * carry;
            }
            lastNum = num;
        }

        return String.valueOf(total);
    }


    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[\\S]+(?=[\\s]*[第][零一二三四五六七八九十百两0-9]+[集])");
        Matcher matcher = pattern.matcher("");
        if(matcher.find())
            System.out.println(matcher.group());


    }
}
