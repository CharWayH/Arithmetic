package testset.testtreeset;

import java.util.TreeSet;

/**
 * @author charwayH
 */
public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<String> stringSet = new TreeSet<>();
        //插入6个元素
        stringSet.add("b");
        stringSet.add("C");
        stringSet.add("A");
        stringSet.add("c");
        stringSet.add("a");
        stringSet.add("B");
        //插入一个相同的元素
        stringSet.add("A");
        //元素个数
        System.out.println("元素个数:"+stringSet.size());
        System.out.println(stringSet);
    }
}
