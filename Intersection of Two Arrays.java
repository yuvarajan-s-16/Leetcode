class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int num:nums1)
        {
            set1.add(num);
        }
        for(int num:nums2)
        {
            set2.add(num);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int num:set1)
        {
            for(int num1:set2)
            {
                if(num==num1)
                {
                    arr.add(num);
                }
            }
        }
        int[] array=new int[arr.size()];
        int i=0;
        for(int num:arr)
        {
            array[i++]=num;
        }
        return array;
    }
}
