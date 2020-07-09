package demo01;

import java.util.Arrays;

/*
面向过程：当需要实现一个功能的时候，每一个具体的步骤都要亲力亲为，详细处理每一个细节
面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有该功能的人，来帮我做事
 */
public class Demo01PrintArray {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };

        // 要求打印格式为:[1, 2, 3, 4, 5, 6]
        // 使用面向过程，每一个步骤都要亲力亲为
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + " ,");
            }
        }
        System.out.println("=============");

        System.out.println(Arrays.toString(array));
    }

}
