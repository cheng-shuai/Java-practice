package demo05;

import java.util.ArrayList;

/*
题目:
定义以指定打印集合的方法{ArrayList类型作为参数},使用{}扩起集合,使用@分隔每个元素
格式参照 {元素@元素@元素}

System.out.println(list);       [1, 2, 3]
printArrayList(list);           {1@2@3}
 */
public class Demo03ArrayListPrint {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("送宏远桥");
        list.add("张无忌");
        list.add("张翠山");
        System.out.println(list); //[张三丰, 送宏远桥, 张无忌, 张翠山]
        System.out.println("==============");
        printArrayList(list);

    }

    /*
    定义方法的三要素:
    返回值类型:只是进行打印而已,没有运算,没哟结果:所以用void
    方法名称:printArrayList
    参数列表:ArrayList
     */
    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() -1) {
                System.out.println(list.get(i) + "}");
            } else {
                System.out.print(list.get(i) + "@");
            }
        }
    }


}
