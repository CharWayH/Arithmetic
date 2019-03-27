import java.util.Arrays;

public class TestOpArray {
    public static void main(String[] args) {
        //解决数组的长度不可变的问题
        int[] array = new int[]{9,8,7};
        //快速查看数组中的元素
        System.out.println(Arrays.toString(array));

        //要加入数组的目标元素
        int dst = 6;

        //创建一个新的数组，长度是原数组长度+1
        int[] newArray = new int[array.length+1];
        //将原数组中的所有元素全部添加到新数组
        for(int i = 0;i < array.length; i++){
            newArray[i] = array[i];
        }
        //把目标元素放入新数组的最后
        newArray[array.length] = dst;
        array = newArray;
        System.out.println(Arrays.toString(array));
    }
}
