package testlist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author charwayH
 */
public class TestArrayList {
    public static void main(String[] args) {

        //ArrayList 有序可重复，String泛型，JDK1.7以后new ArrayList<>的<>内可以不填类型
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        //有效元素的个数
        System.out.println("有效元素的个数:"+list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

        System.out.println("----------------------------------------------");
        //创建list1，并添加元素
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        //创建list2，并添加元素
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        //将list2添加到list1中
        list1.addAll(list2);
        System.out.println(list1);


        System.out.println("----------------------------------------------");
        //迭代器
        Iterator<Integer> it = list2.iterator();
        while(it.hasNext()){
            System.out.println("迭代器输出："+it.next());
        }

        System.out.println("----------------------------------------------");
        //list中是否包含元素o
        System.out.println("list中是否包含40："+list1.contains(40));


        System.out.println("----------------------------------------------");
        //list中是否包含元素o
        System.out.println("list1中是否包含40："+list1.contains(40));

        System.out.println("----------------------------------------------");
        //查找元素所在的索引号
        System.out.println("list1中40出现的索引号："+list1.indexOf(40));
        System.out.println("list1中40最后出现的索引号："+list1.lastIndexOf(40));

        System.out.println("----------------------------------------------");
        //元素移除
        System.out.println(list2);
        System.out.println("移除索引号为1的元素"+list2.remove(1));
        System.out.println("移除元素值为300的元素"+list2.remove(new Integer(300)));
        System.out.println(list2);

        System.out.println("----------------------------------------------");
        //将list1中的所有元素清除
        list1.clear();
        System.out.println(list1);

        System.out.println("----------------------------------------------");
        //判断集合是否为空
        System.out.println("list1是否为空："+list1.isEmpty());





    }
}
