package demo02;

/*
== 是进行对象的地址值比较,如果确实需要字符串的内容比较,可以使用两个方法

public boolean equals(Object obj); 参数可以是任何对象,只有参数是一个字符串彼且内容相同的才会给true,否则返回false
注意事项:
1.任何对象都能用Object进行接收
2.equals方法具有对称性,也就是a.equals(b)和b.equals(a)效果一样
3.如果比较双方一个常量和一个变量,推荐把常量字符串写在前面
推荐: "abc".equals(str)   不推荐: str.equals("abc")

public boolean equalsIgnoreCase(String str); 忽略大小写,进行内容比较
 */
public class Demo01StringEquals {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(chars);

        System.out.println(str1.equals(str2)); // true
        System.out.println(str2.equals(str3)); // true
        System.out.println(str3.equals("Hello")); // true

        String str4 = "hello";
        System.out.println(str1.equals(str4)); // false
        System.out.println("=============");

        String str5 = null;
        System.out.println("abc".equals(str5)); // 推荐:false
//        System.out.println(str5.equals("abc")); // 不推荐:报错
        System.out.println("===========");

        String strA = "java";
        String strB = "Java";
        System.out.println(strA.equals(strB)); // false,严格区分大小写
        System.out.println(strA.equalsIgnoreCase(strB)); // true,忽略大小写

        // 注意,只有英文字母区分大小写,其他都不区分大小写
        System.out.println("一".equalsIgnoreCase("壹")); // false
    }

}
