package Basic1Arrays;

import java.util.Random;

public class init {


    public static void initArray1() {
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] += i;
            System.out.println(array1[i]);
        }
        return;
    }


//    static int[] initFibonacciArray() {
//
//        int a = 0;
//        int b = 1;
//
//        int[] array2 = new int[10];
//        for (int i = 0; i < array2.length; i++) {
//
//            System.out.println(a);
//            int sum = a + b;
//            a = b;
//            b = sum;
//        }
//    }
//
//
//    public static initArrray3() {
//
//        Random random = new Random();
//        int min = 5;
//        int max = 31;
//        int[] array3 = new int[]{random.nextInt(max - min) + min};
//
//    }
}
