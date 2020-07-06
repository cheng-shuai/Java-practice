/*
比较运算符：
大于：     >
小于：     <
大于等于：  >=
小于等于：  <=
相等：     ==
不相等：   !=

注意事项：
1.比较运算符的结果一定是一个boolean值，成立就是true，不成立就是false
2.如果进行多个判断，不能连着写
 */
public class Demo08Operator {
    public static void main(String[] args) {
        System.out.println(10 > 5); // true
        int num1 = 10;
        int num2 = 12;
        System.out.println(num1 < num2); // true
        System.out.println(num2 >= 100); //false
        System.out.println(num2 <= 100); //true
        System.out.println(num2 <= 12); // true
        System.out.println("==========");

        System.out.println(10 ==10); // true
        System.out.println(20 != 23); //true
        System.out.println(20 != 20); //false
    }
}
