package demo04;

public class Demo02Student {

    public static void main(String[] args) {
        Student student = new Student(); // 无参构造方法执行啦
        System.out.println("===============");

        Student student1 = new Student("赵丽颖",20);
        System.out.println("姓名：" + student1.getName() + "年龄：" + student1.getAge());
        // 如果需要改变对象当中的成员变量数据内容，仍然需要使用setXxx方法
        student1.setAge(23);
        System.out.println("姓名：" + student1.getName() + "年龄：" + student1.getAge());

    }

}
