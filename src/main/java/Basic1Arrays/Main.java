package Basic1Arrays;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {

            System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;
        }


    }
}
