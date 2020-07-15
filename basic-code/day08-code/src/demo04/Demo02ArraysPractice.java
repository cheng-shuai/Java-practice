package demo04;

import java.util.ArrayList;
import java.util.Arrays;

/*
题目:
请使用Arrays相关的API,将一个随机的字符串中的所有的字符升序排列,并倒序打印
 */
public class Demo02ArraysPractice {

    public static void main(String[] args) {
        String str = "alkshdfauiywerhqui2yhwujfcgqu4yr";

        // 如何进行升序排列:sort
        // 必须是一个数组,才能用Arrays.sort方法
        // String --> 数组: 用toCharArray
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
        // 使用sort对字符数组进行升序排列
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));

        // 进行倒序打印
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }

}
