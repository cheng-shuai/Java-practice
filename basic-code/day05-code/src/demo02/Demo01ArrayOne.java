package demo02;

public class Demo01ArrayOne {

    public static void main(String[] args) {
        int[] array;
        array = new int[3];
        System.out.println(array); // [I@6debcae2
        System.out.println(array[0]); // 0
        System.out.println(array[1]); // 0
        System.out.println(array[2]); // 0
        System.out.println("============");

        array[1] = 10;
        array[2] = 20;
        System.out.println(array); // [I@6debcae2
        System.out.println(array[0]); // 0
        System.out.println(array[1]); // 10
        System.out.println(array[2]); // 20
    }

}
