class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
      int[] arr=new int[2];
      int answer1=0,answer2=0;
      for(int i=0;i<nums1.length;i++)
      {
        for(int j=0;j<nums2.length;j++)
        {
            if(nums1[i]==nums2[j])
            {
                answer1++;
                break;
            }
        }
      }  
      for(int i=0;i<nums2.length;i++)
      {
        for(int j=0;j<nums1.length;j++)
        {
            if(nums2[i]==nums1[j])
            {
                answer2++;
                break;
            }
        }
      }
      arr[0]=answer1;
      arr[1]=answer2;
      return arr;
    }
}
