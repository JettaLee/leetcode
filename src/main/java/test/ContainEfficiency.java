package test;

import org.apache.commons.lang.RandomStringUtils;

import java.util.ArrayList;

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


    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        for(String s : list) {
//            sb.append("\""+s+"\""+",");
//        }
//        System.out.println(sb.toString());
        long startTime=System.currentTimeMillis();   //获取开始时间

        for(int i = 0; i< 10;i++) {
            if(list.contains(RandomStringUtils.randomNumeric(10))) {
                System.out.println("yes");
                //测试的代码段
            }
        }
        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
    }
}
