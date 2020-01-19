package Basic3Maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String[] array = new String[]{"abc", "abc", "efghijk", "abc", "lmnopr", "st", "abc", "u", "vwxyz", "st", "u", "vwxyz"};

        Map<String, Integer> map = new HashMap<String, Integer>();


        for (String element: array) {
            if(map.containsKey(element)){
                map.put(element, map.get(element)+1);
            }
            else {
                map.put(element, 1);
            }

        }
        System.out.println(map);




    }


}

