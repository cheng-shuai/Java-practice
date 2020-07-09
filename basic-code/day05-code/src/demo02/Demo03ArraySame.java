package demo02;

public class Demo03ArraySame {

    public static void main(String[] args) {
        int[] arrayA;
        arrayA = new int[3];
        System.out.println(arrayA); // [I@6debcae2
        System.out.println(arrayA[0]); // 0
        System.out.println(arrayA[1]); // 0
        System.out.println(arrayA[2]); // 0
        System.out.println("============");

        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA); // [I@6debcae2
        System.out.println(arrayA[0]); // 0
        System.out.println(arrayA[1]); // 10
        System.out.println(arrayA[2]); // 20

        System.out.println("==============");

        int[] arrayB;
        arrayB = arrayA;
        System.out.println(arrayB); // [I@6debcae2
        System.out.println(arrayB[0]); // 0
        System.out.println(arrayB[1]); // 0
        System.out.println(arrayB[2]); // 0
        System.out.println("============");

        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB); // [I@6debcae2
        System.out.println(arrayB[0]); // 0
        System.out.println(arrayB[1]); // 100
        System.out.println(arrayB[2]); // 200
        System.out.println("==========");

        System.out.println(arrayA[0]); // 0
        System.out.println(arrayA[1]); // 100
        System.out.println(arrayA[2]); // 200
    }

}
