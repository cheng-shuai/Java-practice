package demo02;

public class Demo01phoneOne {

    public static void main(String[] args) {
        // 根据Phone类，创建一个名为one的对象
        // 格式：类名称 对象名 = new 类名称();
        Phone one = new Phone();
        System.out.println(one.brand); // null
        System.out.println(one.price); // 0.0
        System.out.println(one.color); // null

        one.brand = "苹果";
        one.price = 654.2;
        one.color = "黑色";
        System.out.println(one.brand); // 苹果
        System.out.println(one.price); // 654.2
        System.out.println(one.color); // 黑色

        one.call("乔布斯");
        one.sendMessage();
    }

}
