class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n=nums.size(),c=0,j,k=1;
        if(n==1 && n<target)
        {
            return 1;
        }
        for(int i=0;i<n-1;i++)
        {
            j=k;
            while(j<n)
            {
            if(nums.get(i)+nums.get(j)<target)
            {
                c++;
            }
            j++;
            }
            k++;
        }
        return c;
    }
}
