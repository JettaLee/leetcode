/**
 * @author Li Jingwei
 * @date 2019/7/18 下午3:19
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

public class MinStack {

    private ArrayList<Integer> container;

    private int min;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        container = new ArrayList<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        container.add(x);
        min = Math.min(min, x);
    }

    public void pop() {
        if (container.size() > 0) {
            if (container.get(container.size() - 1) == min) {
                container.remove(container.size() - 1);
                min = findMin(container);
            } else {
                container.remove(container.size() - 1);
            }
        }
    }

    private int findMin(ArrayList<Integer> list) {
        if (list.isEmpty())
            return Integer.MAX_VALUE;
        int localMin = Integer.MAX_VALUE;
        for (int i : list) {
            if (i < localMin)
                localMin = i;
        }
        return localMin;
    }

    public int top() {
        return container.size() > 0 ? container.get(container.size() - 1) : 0;
    }

    public int getMin() {
        return min;
    }
}
