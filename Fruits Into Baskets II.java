class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length,alloted=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(fruits[i]<=baskets[j])
                {
                    alloted++;
                    baskets[j] = -1;
                    break;
                }
            }
        }
        return n - alloted;
    }
}
