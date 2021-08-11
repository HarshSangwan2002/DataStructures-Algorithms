class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();

        for (Integer val : nums1) {
            set1.add(val);
        }

        HashSet<Integer> set2 = new HashSet<>();

        for (Integer val : nums2) {
            if (set1.contains(val)) {
                set1.remove(val);
                set2.add(val);
            }
        }

        int[] ans = new int[set2.size()];
        int idx = 0;

        for (int val : set2) {
            ans[idx++] = val;
        }

        return ans;
    }
}