class Solution {
    public int firstMissingPositive(int[] nums) {

        boolean flag = false;

        // Step - 1
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                flag = true;

            else if (nums[i] <= 0 || nums[i] > nums.length)
                nums[i] = 1;
        }

        if (flag == false)
            return 1;

        // Step - 2
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] > 0)
                nums[index] = -1 * nums[index];
        }

        // Step - 3
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                return i + 1;
        }

        return nums.length + 1;
    }
}