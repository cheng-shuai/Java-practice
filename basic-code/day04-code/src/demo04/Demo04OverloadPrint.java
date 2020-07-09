package demo04;
// byte short int long float double char boolean
// String
// 在调用输出语句是，println方法其实就是在进行了多种数据类型的重载形式
public class Demo04OverloadPrint {

    public static void main(String[] args) {
        myPrint(100); // int
        myPrint("Hello"); // String
    }

    public static void myPrint(short num) {
        System.out.println(num);
    }

    public static void myPrint(int num) {
        System.out.println(num);
    }

    public static void myPrint(long num) {
        System.out.println(num);
    }

    public static void myPrint(float num) {
        System.out.println(num);
    }

    public static void myPrint(double num) {
        System.out.println(num);
    }

    public static void myPrint(char zifu) {
        System.out.println(zifu);
    }

    public static void myPrint(boolean isSame) {
        System.out.println(isSame);
    }

    public static void myPrint(String str) {
        System.out.println(str);
    }
}
