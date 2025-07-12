class Solution {
    public int countKDifference(int[] nums, int k) {
        int len = nums.length;
        if(len == 1){
            return 0;
        }

        int count = 0;
        int[] freq = new int[101];
        for (int i : nums){
            freq[i]++;
        }

        for(int i=1; i<=100-k; i++){
                count += freq[i] * freq[i+k];
        }

        return count;
    }
}
