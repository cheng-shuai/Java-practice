package demo03;
/*
面向对象的三大特征：封装、继承、多态

封装性在java中的体现：
1.方法就是一种封装
2.关键字private也是一种封装

封装就是将一些细节信息隐藏起来，对于外界不可见
 */
public class Demo02Method {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 1, 23, 2 };
        int max = getMax(array);
        System.out.println("最大值是：" + max);
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = max > array[i] ? max : array[i];
        }
        return max;
    }

}
