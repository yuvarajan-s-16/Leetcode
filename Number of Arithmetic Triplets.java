class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            seen.put(nums[i], i);
        }
        for (int num : nums) {
            if (seen.containsKey(num + diff) && seen.containsKey(num + 2 * diff)) {
                counter++;
            }
        }
        return counter;
    }
}
