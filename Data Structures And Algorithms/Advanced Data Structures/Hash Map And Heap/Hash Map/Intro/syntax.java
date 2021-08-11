import java.util.HashMap;
import java.util.Set;

public class syntax {

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 133);
        hm.put("China", 140);
        hm.put("Pak", 40);
        hm.put("US", 30);
        hm.put("UK", 15);

        System.out.println(hm);

        hm.put("Nigeria", 10);
        hm.put("US", 25);

        System.out.println(hm);

        System.out.println(hm.get("India"));
        System.out.println(hm.get("Utopia"));
        System.out.println(hm.containsKey("Utopia"));

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String kep : hm.keySet()) {
            Integer val = hm.get(kep);
            System.out.println(kep + " " + val);
        }
    }
}