package demo03;

public class Demo03Person {

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "赵丽玲";
        person.setAge(-12);
//        person.age = 20; // 直接访问private内容，错误写法
        person.show();
    }

}
