package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {

    static class Apple {
        private String name;
        private int weight;
        public Apple(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }
    }


    public static void main(String[] args) {
        String s = "你好_中国_人_";
        String s1 = s.replaceAll("_", "\\u");
        System.out.println();
    }
}
