package testset.testhashset;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author charwayH
 */
public class TestHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        //新增元素(元素顺序与添加顺序无关)
        set.add("b");
        set.add("B");
        set.add("a");
        set.add("C");
        set.add("c");
        set.add("A");
        for (String s:set) {
            System.out.println(s);
        }
        System.out.println(set);

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //删除指定元素
        set.remove("C");
        System.out.println(set);
    }
}
