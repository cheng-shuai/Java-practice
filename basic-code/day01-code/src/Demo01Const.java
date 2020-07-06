public class Demo01Const {
    /*
    常量：在程序运行期间，固定不变的量

    常量的分类：
    1.字符串常量：凡是用双引号引起来的部分，叫做字符串常量。例如："abc","Hello","123"
    2.整数常量：直接写上的数字，没有小数点。例如：100，200
    3.浮点数常量：直接写上的数字，有小数点。例如：2.1,2.3
    4.字符常量：凡是用单引号引起来的单个字符，叫做字符常量。例如：‘A’，‘b’
    5.布尔常量：只有两种取值。true和false
    6.空常量：null。代表没有任何数据
    */
    public static void main(String[] args) {
        //字符串常量
        System.out.println("abc");
        System.out.println("");//字符串两个双引号中间的内容为空
        System.out.println("xyz");
        System.out.println("============");

        //整数常量
        System.out.println(30);
        System.out.println(-19);
        System.out.println("============");

        //浮点数常量（小数）
        System.out.println(3.12);
        System.out.println(-2.23);
        System.out.println("============");

        //字符常量
        System.out.println('a');
        System.out.println('6');
        // System.out.println(''); //两个单引号中间必须有且仅有一个字符，没有不行
        //System.out.println('qw'); //两个单引号中间必须有且仅有一个字符，有两个不行
        System.out.println("============");

        //布尔常量
        System.out.println(true);
        System.out.println(false);
        System.out.println("============");

        //空常量，空常量不能直接用来打印输出
        //System.out.println(null);

    }
}
