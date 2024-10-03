class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans[] = new int[nums.size()+1];
        ans[0]=0;
        int sum=0;
        if(k==0)
        {
           return nums.get(0);
        }
        for(int i=1;i<nums.size();i++){
            ans[i] = ans[i/2] + (i%2);
            if(ans[i]==k)
            {
                sum+=nums.get(i);
            }
        }
        return sum;
    }
}
