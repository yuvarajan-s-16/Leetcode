class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] hash=new int[51];
        int xor=0;
        for(int i=0;i<nums.length;i++)
        {
            hash[nums[i]]++;
        
            if(hash[nums[i]]>1)
            {
               xor=xor^nums[i];
               hash[nums[i]]--;
            }
        }
        return xor;
    }
}
