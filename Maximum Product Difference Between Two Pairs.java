class Solution {
    public int maxProductDifference(int[] nums) {
        int firstBig = 0, secondBig = 0;
        int firstSmall = Integer.MAX_VALUE, secondSmall = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n < firstSmall) {
                secondSmall = firstSmall;
                firstSmall = n;
            } else if (n < secondSmall) {
                secondSmall = n;
            }

            if (n > firstBig) {
                secondBig = firstBig;
                firstBig = n;
            } else if (n > secondBig) {
                secondBig = n;
            }
        }

        return firstBig * secondBig - firstSmall * secondSmall;        
    }
}
