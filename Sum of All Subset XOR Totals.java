class Solution {
    public int subsetXORSum(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total |= num;  
        }
        return total * (int)(Math.pow(2,(nums.length - 1)));
    }
}
