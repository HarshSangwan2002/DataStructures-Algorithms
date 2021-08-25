import java.util.*;

public class intro {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 135);
        map.put("US", 40);
        map.put("UK", 30);

        System.out.println(map);

        map.put("India", 140);
        map.put("Nigera", 10);

        System.out.println(map.get("India"));
        System.out.println(map.get("Pak"));

        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Pak"));

        Set<String> keys = map.keySet();

        System.out.println(keys);

        for (String key : map.keySet())
            System.out.println(key + " " + map.get(key));
    }
}