/*
自增运算符：++
自减运算符：--

基本含义：让一个变量涨一个数字1，或者让变量降一个数字1
使用格式：写在变量名称之前，或者卸载变量名称之后。例如：++num，也可以num++
使用方法：
    1.单独使用：不和其他任何操作混合，自己独立成为一个步骤
    2.混合使用：和其他操作混合，例如和赋值混合，或者和打印混合等
使用区别：
    1.在单独使用的时候，前++和后++没哟任何区别，也就是：++num；和num++；是完全一样的
    2.在混合使用的时候，有【重大区别】
        a 如果是【前++】，那么变量【立刻马上+1】，然后拿着结果进行使用  【先加后用】
        b 如果是【后++】，那么首先使用变量本来的数值，【然后再让变量+1】 【先用后加】
注意事项：
    只有变量才能使用自增、自减运算符。常量不可以发生改变，所以不能用。
 */
public class Demo06Operator {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1); // 10
        ++num1; // 单独使用，前++
        System.out.println(num1); // 11
        num1++; // 单独使用，后++
        System.out.println(num1); // 12
        System.out.println("==============");

        //与打印操作混合使用
        int num2 = 20;
        // 混合使用，先++，变量立刻马上变成21，然后打印结果21
        System.out.println(++num2); // 21
        System.out.println(num2); //21
        System.out.println("==============");

        int num3 = 30;
        // 混合使用，后++，首先使用本来变量的30，然后再让变量+1得到31
        System.out.println(num3++); // 30
        System.out.println(num3); // 31

    }
}
