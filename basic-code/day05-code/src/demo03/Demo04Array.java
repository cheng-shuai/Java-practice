package demo03;
/*
遍历数组，说的就是对数组当中的每一个元素进行统一、挨个处理，默认的处理方式就是打印输出
 */
public class Demo04Array {

    public static void main(String[] args) {
        int[] array = { 23, 434, 543, 45, 24};

        // 首先使用原始方式
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println("==========");

        // 使用循环，次数就是数组的长度

        for (int i = 0; i < 4; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=============");

        // 使用高级格式
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
