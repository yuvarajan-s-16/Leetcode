class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
