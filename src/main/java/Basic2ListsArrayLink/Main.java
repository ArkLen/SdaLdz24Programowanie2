package Basic2ListsArrayLink;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(random.nextInt(1000));
        }

        for (int i = 0; i < 500_000; i++) {
            arrayList.remove(random.nextInt(1_000_000));

        }
        long stopTime = System.currentTimeMillis();
    }
}
