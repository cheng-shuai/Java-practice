package demo03;

public class Zi extends Fu{

    int num = 20;

    public void method() {
        int num = 30;
        System.out.println(num); // 局部变量 30
        System.out.println(this.num); // 本类中成员变量 20
        System.out.println(super.num); // 父类的成员变量 10
    }

}
