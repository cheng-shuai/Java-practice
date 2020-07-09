package demo01;
/*
直接打印数组名称，得到的是数组对应的内存地址哈希值
二进制：01
十进制：0123456789
十六进制：0123456789abcdef

访问数组元素的格式，数组名称[索引值]
索引值：就是一个int数字，代表数组当中元素的编号
[注意]索引值从0开始，一直到“数组的长度为-1”为止
 */
public class Demo04ArrayUse {

    public static void main(String[] args) {
        // 静态初始化的省略格式
        int[] arrayA = { 1, 2, 3 };

        System.out.println(arrayA); // [I@6debcae2

        System.out.println(arrayA[1]); //2
        System.out.println(arrayA[2]); //3

        int num = arrayA[0];
        System.out.println(num); // 1
    }

}
