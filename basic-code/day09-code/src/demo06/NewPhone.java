package demo06;

public class NewPhone extends Phone {

    @Override
    public void show() {
        super.show(); // 继承父类的功能
        // 加入新的功能
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
