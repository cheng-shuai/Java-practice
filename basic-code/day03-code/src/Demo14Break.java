/*
break关键字的用法有常见的两种：

1.可以用在switch语句当中，一旦执行，整个switch语句立刻退出
2.还可以用在循环语句当中，一旦执行，整个循环语句立刻结束，打断循环

凡是循环次数确定的，有一个小建议：
凡是确定次数的循环多用for循环;否则都用while循环
 */
public class Demo14Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            //如果希望从第四次开始，后续的全部都不要，就要打断循环
            if (i == 4) {
                break;
            }
            System.out.println("Hello" + i);
        }
    }
}
