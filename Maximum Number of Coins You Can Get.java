class Solution {
    public int maxCoins(int[] piles) {
        int l=piles.length-2,sum=0;
        Arrays.sort(piles);
        for(int i=0;i<piles.length/3;i++)        {
            sum+=piles[l];
            l-=2;          
        }
        return sum;
    }
}
