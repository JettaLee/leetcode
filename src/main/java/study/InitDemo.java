package study;

import org.springframework.web.context.request.RequestContextHolder;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeSet;

/**
 * @author: Li Jingwei
 * @date: 2020/03/10 13:48
 */
public class InitDemo {

    static {
        System.out.println("InitDemo static init ...");
    }

    public static void main(String[] args) {
        System.out.println(InitA.value);
//        System.out.println("InitDemo main begin");
//        InitA a = new InitA();
//        System.out.println(InitA.width);
//        InitA b = new InitA();
        Hashtable<String, String> h = new Hashtable<>();
//        HashMap<String, String> h = new HashMap<>();
        h.put(null,"null");


    }
}

/**
 * InitDemo main begin
 * InitBase static init ...
 * InitA static init ...
 * InitA init ...
 */

class InitBase{

    static {
        System.out.println("InitBase static init ...");
    }
    public static int value = 123;
}

class InitA extends InitBase {

    public static int width = 60;

    static {
        System.out.println("InitA static init ...");
        width = 30;
    }

    public InitA() {
        System.out.println(" InitA init ... ");
    }

}

