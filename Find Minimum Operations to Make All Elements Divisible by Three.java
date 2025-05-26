class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int i:nums)
        {
            if(i%3!=0)
            {
                c++;
            }
        }
        return c;
    }
}
