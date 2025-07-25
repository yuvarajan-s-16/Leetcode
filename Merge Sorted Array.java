class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=0;
        for(int i=m;i<(n+m);i++)
        {
            nums1[i]=nums2[l];
            l++;
        }
        Arrays.sort(nums1);
        /* for(int i=0;i<n;i++)
        {
            for(int j=0;j<)
            if(nums2[i]<=nums1[i])
            {
                int temp=nums1[i];
                nums1[i]=nums2[i];
                nums1[i+1]=temp;
            }
        } */
    }
}
