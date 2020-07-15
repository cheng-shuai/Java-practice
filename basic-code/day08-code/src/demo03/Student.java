package demo03;

public class Student {

    private int id; // 学号
    private String name; // 姓名
    private int age; // 年龄
    static String room; // 教室
    private static int idCounter = 0; // 学号计数器,每当new了一个新对象的时候,计数器++

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Student.idCounter = idCounter;
    }

    public Student( String name, int age) {
        this.id = idCounter++;
        this.name = name;
        this.age = age;
    }

    public Student() {
        idCounter++;
    }
}
