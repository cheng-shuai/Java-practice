/*
四则运算当中的加号“+”有常见的三种用法：

1.对于数值来说，那就是加法。
2.对于字符char类型来说，在计算之间，char会被提升成为int，然后再进行计算。
char类型字符，和int类型数字，之间的对照关系表：ASCII、Unicode
3.对于字符串String（首字母大写，并不是关键字）来说，加号代表字符串连接操作。
任何数据类型和支付串进行连接的时候，结果都会变成字符串
 */
public class Demo05Plus {
    public static void main(String[] args) {
        // 字符串类型的变量的基本使用
        // 数据类型 变量名称 = 数据值;
        String srt1 = "Hello";
        System.out.println(srt1); // Hello

        System.out.println("Hello" + "World"); // HelloWorld

        String str2 = "java";
        // String + int --> String
        System.out.println(str2 + 20); // java20

        // 优先级问题
        // String + int + int
        // String       + int
        // String
        System.out.println(str2 + 20 + 30); // java2030

        System.out.println(str2 + (20 + 30)); // java50
    }
}
