package WarmUp3;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[] { -2, 3, 1, 23, -9, 0, 12, 6, -4 };

        // zrób to za pomocą metod

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i <array.length; i++){
            if (array[i] < min){
                min = array[i];
            }

            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.printf("Min = %d\nMax = %d" , min, max);







    }
}
