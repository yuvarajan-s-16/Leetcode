class Solution {
    public int[] numberGame(int[] nums) {
        int l=nums.length;
        int[] arr=new int[l];
        Arrays.sort(nums);
        for(int i=0;i<l;i+=2)
        {
          arr[i]=nums[i+1];
          arr[i+1]=nums[i];
        }
        return arr;
    }
}
