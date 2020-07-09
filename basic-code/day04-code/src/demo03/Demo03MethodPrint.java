package demo03;
/*
题目要求：
定义一个方法，用来打印指定次数的HelloWorld
 */
public class Demo03MethodPrint {

    public static void main(String[] args) {
        printCount(10);
    }

    /*
    三要素：
    返回值类型：只是进行一大堆的打印操作而已，没有计算，也就没有结果要告诉调用处
    方法名称：printCount
    参数列表：到底要打印多少次？必须告诉我，否则我不知道多少次，没法打印次数 int
     */

    public static void printCount(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("HelloWorld" + (i + 1));
        }
    }

}
