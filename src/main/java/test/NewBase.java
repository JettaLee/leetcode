package test;

/**
 * @author: Li Jingwei
 * @date: 2020/04/02 11:26
 */
public class NewBase extends Base {
//    public NewBase(int typeId) {
//        this.typeId = typeId;
//    }

    public void test(){
        System.out.println(typeId);
    }

    public static void main(String[] args) {
        new NewBase().test();
        System.out.println();
    }
}
