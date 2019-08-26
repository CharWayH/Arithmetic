package testmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author charwayH
 */
public class TestHashMap {
    public static void main(String[] args) {
        //添加map
        HashMap<Integer,String> map = new HashMap<>(10);
        //无序添加元素
        map.put(5,"a");
        map.put(6,"E");
        map.put(4,"W");
        map.put(1,"p");
        map.put(7,"T");
        map.put(2,"x");
        map.put(3,"C");
        //添加相同键的元素，值会被覆盖
        map.put(3,"a");
        System.out.println(map);

        //移除key为3的映射
        map.remove(3);
        System.out.println(map);

        //修改key为5的value
        map.replace(5,"5");
        System.out.println(map);

        //查看key为2的value
        System.out.println(map.get(2));

        //获取map集合的全部key
        Set<Integer> keys = map.keySet();
        //通过迭代器遍历keys
        Iterator<Integer> it = keys.iterator();
        while(it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key+"----"+value);
        }



    }
}
