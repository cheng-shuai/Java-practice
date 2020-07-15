package demo04;

/*
java.util.Math类是数学相关工具类,里面提供了大量的静态方法,完成与数学运算相关的操作

public static double abs(double num); 获取绝对值,有多种重载
public static double ceil(double num); 向上取整
public static double floor(double num); 向下取整
public static long round(double num); 四舍五入

Math.PI代表近视的圆周率(double)
 */
public class Demo03Math {

    public static void main(String[] args) {
        // 获取绝对值
        System.out.println(Math.abs(2.5)); // 2.5
        System.out.println(Math.abs(-2.5)); // 2.5

        // 向上取整
        System.out.println(Math.ceil(2.9)); // 3.0
        System.out.println(Math.ceil(2.1)); // 3.0

        // 向下取整
        System.out.println(Math.floor(2.1)); // 2.0
        System.out.println(Math.floor(2.9)); // 2.0

        // 四舍五入
        System.out.println(Math.round(2.4)); // 2
        System.out.println(Math.round(2.5)); // 3
    }

}
