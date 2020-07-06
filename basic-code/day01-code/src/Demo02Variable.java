/*
变量：程序运行期间，内容可以发生改变的量

创建一个变量并且使用的格式：

数据类型 变量名称; //创建了一个变量
变量名称 = 数据值; //赋值，将右边的数据值，赋值交给左边的变量

一步到位的格式；

数据类型 变量名称 = 数据值; // 在创建一个变量的同时，立刻放入指定的数据值
 */
public class Demo02Variable {
    public static void main(String[] args) {
        // 创建一个变量
        //格式： 数据类型 变量名称;
        int num;
        // 向变量当中存入一个数据
        // 格式：变量名称 = 数据值;
        num = 23;
        // 打印输出变量名称时，显示出来的是变量的内容
        System.out.println(num);
        System.out.println("============");


        //定义字节型变量
        byte b = 100;
        System.out.println(b);
        //定义短整数型变量
        short s = 1000;
        System.out.println(s);
        //定义整型变量
        int i = 123456;
        System.out.println(i);
        //定义长整型变量
        long l = 21348674534l;
        System.out.println(l);
        //定义单精度浮点型变量
        float f = 1.1F;
        System.out.println(f);
        //定义双精度浮点型变量
        double d = 9.3;
        System.out.println(d);
        //定义布尔型变量
        boolean bool = false;
        System.out.println(bool);
        //定义字符型变量
        char c = 'A';
        System.out.println(c);

    }
}
