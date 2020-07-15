package demo07;

public class Zi extends Fu {

    public Zi() {
//        super(); // 在掉用父类无参构造方法
        super(10); // 在调用父类重载的构造方法
        System.out.println("子类构造方法");
    }

    public void method() {
//        super(); // 错误写法,只有子类构造翻翻,才能调用父类构造方法
    }

}
