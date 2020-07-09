package demo03;

public class Demo05ArrayMax {

    public static void main(String[] args) {
        int[] array = { 12, 32, 45, 64, 633, 123 };
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = max > array[i] ? max : array[i];
        }
        System.out.println(max);
    }

}
