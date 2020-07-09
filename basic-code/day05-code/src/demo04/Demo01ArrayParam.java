package demo04;
/*
数组可以作为方法的参数
当调用方法的时候，向方法的小括号进行传参，传递进去的其实就是数组的地址值
 */
public class Demo01ArrayParam {

    public static void main(String[] args) {
        int[] array = { 12, 13, 14, 13, 24 };

        System.out.println(array); //地址值

        printArray(array); // 传递进去的就是array当中保存的地址值
        System.out.println("=====AAA=====");
        printArray(array);;
        System.out.println("=====BBB=====");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
