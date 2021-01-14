package hashmap;

import java.util.HashMap;

public class JavaHashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();

        myMap.put("", 25);
        myMap.put("saniyat", 26);
        myMap.put("saniyat", 27);

        System.out.println(myMap);
    }
}
