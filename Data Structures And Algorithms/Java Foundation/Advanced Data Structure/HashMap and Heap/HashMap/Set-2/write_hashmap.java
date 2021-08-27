import java.io.*;
import java.util.*;

public class write_hashmap {

    public static class HashMap<K, V> {
        private class HMNode {
            K key;
            V value;

            HMNode(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; // n
        private LinkedList<HMNode>[] buckets; // N = buckets.length

        public HashMap() {
            initbuckets(4);
            size = 0;
        }

        private void initbuckets(int N) {
            buckets = new LinkedList[N];
            for (int bi = 0; bi < buckets.length; bi++) {
                buckets[bi] = new LinkedList<>();
            }
        }

        public void put(K key, V value) throws Exception {
            // write your code here

            int bi = hashfn(key);
            int di = get_idx(key, bi);

            if (di == -1) {
                HMNode node = new HMNode(key, value);
                buckets[bi].add(node);
                size++;
            }

            else {
                HMNode node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = size * 1.0 / buckets.length;

            if (lambda > 2) {
                rehash();
            }
        }

        private int hashfn(K key) {

            int hc = key.hashCode();
            return Math.abs(hc % buckets.length);
        }

        private int get_idx(K key, int idx) {

            int x = 0;

            for (HMNode node : buckets[idx]) {
                if (node.key.equals(key))
                    return x;

                x++;
            }

            return -1;
        }

        public V get(K key) throws Exception {
            // write your code here

            int bi = hashfn(key);
            int di = get_idx(key, bi);

            if (di == -1) {
                return null;
            }

            else {
                HMNode node = buckets[bi].get(di);
                return node.value;
            }
        }

        public boolean containsKey(K key) {
            // write your code here

            int bi = hashfn(key);
            int di = get_idx(key, bi);

            if (di == -1) {
                return false;
            }

            else {
                return true;
            }
        }

        public V remove(K key) throws Exception {
            // write your code here

            int bi = hashfn(key);
            int di = get_idx(key, bi);

            if (di == -1) {
                return null;
            }

            else {
                HMNode node = buckets[bi].remove(di);
                size--;
                return node.value;
            }
        }

        public ArrayList<K> keyset() throws Exception {
            // write your code here

            ArrayList<K> set = new ArrayList<>();

            for (int bi = 0; bi < buckets.length; bi++) {
                for (HMNode node : buckets[bi])
                    set.add(node.key);
            }

            return set;
        }

        public int size() {
            // write your code here
            return size;
        }

        private void rehash() throws Exception {
            LinkedList<HMNode>[] oba = buckets;
            initbuckets(2 * oba.length);
            size = 0;

            for (int i = 0; i < oba.length; i++) {
                for (HMNode node : oba[i])
                    put(node.key, node.value);
            }
        }

        public void display() {
            System.out.println("Display Begins");
            for (int bi = 0; bi < buckets.length; bi++) {
                System.out.print("Bucket" + bi + " ");
                for (HMNode node : buckets[bi]) {
                    System.out.print(node.key + "@" + node.value + " ");
                }
                System.out.println(".");
            }
            System.out.println("Display Ends");
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("put")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                Integer val = Integer.parseInt(parts[2]);
                map.put(key, val);
            } else if (str.startsWith("get")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.get(key));
            } else if (str.startsWith("containsKey")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.containsKey(key));
            } else if (str.startsWith("remove")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.remove(key));
            } else if (str.startsWith("size")) {
                System.out.println(map.size());
            } else if (str.startsWith("keyset")) {
                System.out.println(map.keyset());
            } else if (str.startsWith("display")) {
                map.display();
            }
            str = br.readLine();
        }
    }
}