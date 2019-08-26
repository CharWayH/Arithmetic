package testlist;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author charwayH
 */
public class TestQueue {
    public static void main(String[] args) {
        //创建队列
        LinkedList<String> queue = new LinkedList<>();
        //插入元素到队列
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        //查看队列所有元素
        System.out.println(queue);
        //查看头元素
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        //查看头元素并删除
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
