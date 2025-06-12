class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int diff = 0;
        int counter = 1;
        int temp;

        for (int i = 0; i < nums.length; i++) {
            if (counter == nums.length) {
                counter = 0;
            }

            temp = Math.abs(nums[i] - nums[counter]);

            if (temp > diff) {
                diff = temp;
            }

            counter++;
        }

        return diff;
    }
}
