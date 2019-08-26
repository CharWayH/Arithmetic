package testlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author charwayH
 *  测试LinkedList和ArrayList的插入(删除)和遍历时间对比
 *  LinkedList更适合插入和删除
 *  ArrayList更适合遍历
 */
public class TestLinkedList {
    public static void main(String[] args) {
        //ArrayList插入1000000数据的总耗时

        //ArrayList插入1000000数据的总耗时: 45620
        //ArrayList遍历1000000数据的总耗时: 4
        ArrayList<String> list = new ArrayList<>();
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(0,"a");
        }
        long time2 = System.currentTimeMillis();
        System.out.println("ArrayList插入1000000数据的总耗时: "+(time2-time1));

        Iterator<String> it = list.iterator();
        time1 = System.currentTimeMillis();
        while(it.hasNext()){
            it.next();
        }
        time2 = System.currentTimeMillis();
        System.out.println("ArrayList遍历1000000数据的总耗时: "+(time2-time1));

        //LinkedList插入1000000数据的总耗时

        //LinkedList插入1000000数据的总耗时: 13
        //LinkedList遍历1000000数据的总耗时: 6
        LinkedList<String> queue = new LinkedList<>();
        long time3 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            queue.add(0,"a");
        }
        long time4 = System.currentTimeMillis();
        System.out.println("LinkedList插入1000000数据的总耗时: "+(time4-time3));

        Iterator<String> it2 = queue.iterator();
        time1 = System.currentTimeMillis();
        while(it2.hasNext()){
            it2.next();
        }
        time2 = System.currentTimeMillis();
        System.out.println("LinkedList遍历1000000数据的总耗时: "+(time2-time1));
    }
}
