class Solution {
    public int[] intersection(int[] a, int[] b) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (!map.containsKey(a[i]))
                map.put(a[i], 1);
        }

        for (int i = 0; i < b.length; i++) {
            if (map.containsKey(b[i]) && map.get(b[i]) != 0) {
                list.add(b[i]);
                int of = map.get(b[i]);
                map.put(b[i], 0);
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}