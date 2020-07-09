package demo04;
/*
一个方法可以有0、1、多个参数，但是只能有0个或者1个返回值，不能有多个返回值
如果希望一个方法当中产生了多个结果数据进行返回，怎么办？
解决方法：使用一个数组作为返回值类型即可

任何数据都能作为方法的参数类型，或者返回值类型

数组作为方法的参数，传递进去的其实是数组的地址值
数组作为方法的返回值，返回的其实也是数组的地址值
 */
public class Demo02ArrayReturn {

    public static void main(String[] args) {
        int[] result = calculate(12,32,43);
        System.out.println("总和是：" + result[0]);
        System.out.println("平均是：" + result[1]);
    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        int[] array = { sum, avg };
        return array;
    }

}
