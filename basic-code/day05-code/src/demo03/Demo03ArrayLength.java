package demo03;
/*
如何获取数组的长度，格式：
数组名称.length

这将会得到一个int数字，代表数组的长度

数组一旦创建，程序运行期间，长度不可以改变
 */
public class Demo03ArrayLength {

    public static void main(String[] args) {
        int[] array = { 1, 3, 4, 5, 5, 1, 3, 4};
        int len = array.length;
        System.out.println(len);  // 8
    }

}
