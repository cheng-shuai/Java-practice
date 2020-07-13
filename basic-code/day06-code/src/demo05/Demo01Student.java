package demo05;

public class Demo01Student {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setAge(12);
        stu1.setName("迪丽热巴");
        System.out.println("姓名：" + stu1.getName() + "，年龄：" + stu1.getAge());
        System.out.println("==========");

        Student stu2 = new Student("古力拉扎",13);
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
        stu2.setAge(3123);
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());



    }

}
