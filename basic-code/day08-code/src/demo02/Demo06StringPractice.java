package demo02;

/*
题目:
定义一个方法,把数组{1,2,3}按照指定格式拼接成为一个字符串.格式参照如下:[word1#word2#word3]

分析:
1.首先准备一个int[]数组,内容是:1 2 3
2.定义一个方法,用来将数组变成字符串
三要素:
返回值类型: String
方法名称:fromArrayToString
参数列表:int[]
3.格式:[word1#word2#word3]
用到:for循环 字符串拼接 每个数组元素之间都有一个我人的字样,分割使用的是# 区分一下是不是最后一个
4.调用方法,得到返回值,并打印结果
 */
public class Demo06StringPractice {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        String string = fromArrayToString(array);
        System.out.println(string);
    }

    public static String fromArrayToString(int[] array) {
        String string = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length -1) {
                string += "word" + array[i] + "]";
            } else {
                string += "word" + array[i] + "#";
            }
        }
        return string;
    }

}
