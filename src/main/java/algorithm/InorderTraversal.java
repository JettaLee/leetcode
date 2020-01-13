package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Li Jingwei
 * @date 2020/1/7 下午3:29
 * 中序遍历使用栈
 */
public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        TreeNode cur = root;
        while (cur != null || !stack.empty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            result.add(cur.val);
            cur = cur.right;
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode A = new TreeNode(2);
        TreeNode B = new TreeNode(3);
        root.right = A;
        A.left = B;
        List<Integer> integers = new InorderTraversal().inorderTraversal(root);
        System.out.println();

    }

}
