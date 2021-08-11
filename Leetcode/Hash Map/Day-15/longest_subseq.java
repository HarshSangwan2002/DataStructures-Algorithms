class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (Integer val : nums)
            set.add(val);

        int maxl = 0;

        for (int val : nums) {
            if (!set.contains(val - 1)) {
                int tl = 1;

                while (set.contains(val + tl))
                    tl++;

                if (tl > maxl)
                    maxl = tl;
            }
        }

        return maxl;
    }
}