package demo03;

public class Demo06ArrayMin {

    public static void main(String[] args) {
        int[] array = { 12, 32, 45, 64, 633, 123 };
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = min < array[i] ? min : array[i];
        }
        System.out.println(min);
    }

}
