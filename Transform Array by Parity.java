class Solution {
    public int[] transformArray(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]&1;
        }
        int left=0,right=nums.length-1;
        while(left<right)
        {
            if(nums[left]==0)
            {
                left++;
            }
            else if(nums[right]==1)
            {
                right--;
            }
            else
            {
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
        }
        return nums;
    }
}
