/*
使用变量的时候，有一些注意事项：

1.如果创建多个变量，那么变量之间的名称不可以重复。
2.对于float和long类型来说，字母后缀F和L不要去掉。
3.如果使用byte或者short类型的变量，那么右侧的数据值不能超过左侧的类型的范围。
4.没有进行赋值的变量，不能直接使用：一定要赋值之后才能使用
5.变量使用不能超过作用域的范围。
【作用域】：从定义变量的一行开始，一直到直接所属的大括号结束为止。
6.可以通过一个语句来创建多个变量，但是一般不推荐这么写。
 */
public class Demo03VariableNotice {
    public static void main(String[] args) {

        int num1 = 10; // 创建了一个新的变量，名叫num1
        //int num1 = 20; // 又创建了另一个新的变量，名字也叫num1，错误！

        int num2 = 20;

        int num3;
        num3 = 30;

        int num4; //定义了一个变量，但是没有进行赋值
        //System.out.println(num4); // 直接打印输出是错误的！
        //System.out.println(num5); // 在创建变量之前，不能使用这个变量

        int num5 = 234;
        System.out.println(num5);

        {
            int num6 =23;
            System.out.println(num6);
        }

//        int num6;
//        System.out.println(num6); // 已经超出大括号的范围，超出了作用域，变量不能再使用了

        // 同时创建了三个都是int类型的变量
        int a, b, c;
        // 各自赋值
        a =1;
        b =2;
        c =3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // 同时创建三个int变量，并且同时各自赋值
        int x = 19, y = 23, z = 2334;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
