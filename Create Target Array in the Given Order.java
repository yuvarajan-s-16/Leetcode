class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<nums.length;i++)
        {
            list.add(index[i],nums[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}
