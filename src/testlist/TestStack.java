package testlist;

import java.util.Stack;

/**
 * @author charwayH
 */
public class TestStack {
    public static void main(String[] args) {
        //继承自Vector
        Stack<String>  stack = new Stack<>();
        //推入3个元素
        stack.push("a");
        stack.push("b");
        stack.push("c");
        //查看所有栈元素
        System.out.println("所有栈元素: "+stack);
        //栈元素的总个数
        System.out.println("栈元素的总个数: "+stack.size());
       //元素a是栈中的第几个元素
        System.out.println("元素a是栈中的第"+ stack.search("a") +"个元素");
        //取出两个元素并输出
        System.out.println("取出的第一个顶元素为: "+stack.pop());
        System.out.println("取出的第二个顶元素为: "+stack.pop());
        //栈元素的总个数
        System.out.println("栈元素的总个数: "+stack.size());
    }
}
