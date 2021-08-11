class Solution {
    public int findPeakElement(int[] arr) {

        if (arr.length == 1)
            return 0;

        int lo = 0;
        int hi = arr.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] < arr[mid + 1])
                lo = mid + 1;

            else
                hi = mid;
        }

        return lo;
    }
}