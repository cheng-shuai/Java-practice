package demo04;
/*
题目要求：
比较两个数据是否相等
参数类型分别是两个byte,两个short,两个int,两个long类型
并在main方法中进行测试
 */
public class Demo02MethodOverloadSame {

    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a,b));

        System.out.println(isSame((short) 20, (short) 20));

        System.out.println(isSame(12,14));

        System.out.println(isSame(12L,12L));
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("bytet参数方法执行啦");
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("short参数方法执行啦");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("int参数方法执行啦");
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSame(long a, long b) {
        System.out.println("long参数方法执行啦");
        return a == b;
    }

}
