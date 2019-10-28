import java.util.LinkedList;
import java.util.Queue;

/** Implement stack using queue
 * there are two methods to do so
 */
class MyStack {
    Queue<Integer> queue;

    /**
     * Initialize the data structure here
     */
    public MyStack() {
        queue = new LinkedList<>();
    }

    /** Push element x onto stack */
    public void push(int x) {
        if (queue.isEmpty()) {
            queue.add(x);
        } else {
            Queue<Integer> temp = new LinkedList<>();
            while (!queue.isEmpty()) {
                temp.add(queue.poll());
            }
            queue.add(x);
            while (!temp.isEmpty()) {
                queue.add(temp.poll());
            }
        }
    }

    /** Removes the element on top of the stack and returns that element */
    public int pop() {
        return queue.poll();
    }

    /** Get the top element */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty */
    public boolean isEmpty() {
        return queue.size() == 0;
    }
}