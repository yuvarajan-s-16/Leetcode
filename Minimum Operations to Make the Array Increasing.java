class Solution {
    public int minOperations(int[] nums) {
        int len=nums.length;
        int arr[]=new int[len];
        int count=0;
        for(int i=0; i<len; i++){
            arr[i] = nums[i];
        }
        for(int i=0; i<len-1; i++){
            if(arr[i+1] <= arr[i]){
                arr[i+1] = arr[i]+1;
            }
        }
        for(int i=0; i<len; i++){
            count+=arr[i]-nums[i];
        }
        return count;
    }
}
