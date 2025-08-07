class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums1)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:nums2)
        {
            if(map.containsKey(num)&&map.get(num)>0)
            {
                list.add(num);
                map.put(num,map.getOrDefault(num,0)-1);
            }
        }
        int[] result=new int[list.size()];
        int i=0;
        for(int num:list)
        {
            result[i++]=num;
        }
        return result;
    }
}
