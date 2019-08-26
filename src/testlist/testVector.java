package testlist;

import java.util.Vector;

/**
 * @author charwayH
 */
public class testVector {
    public static void main(String[] args) {
        Vector<String> verctor = new Vector<>();

        verctor.add("a");
        verctor.add("b");
        verctor.add("c");
        System.out.println(verctor);

        System.out.println(verctor.size());

        System.out.println(verctor.capacity());

    }
}
