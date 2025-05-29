class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        int len=candies.length;
        List<Boolean> result=new ArrayList<>();
        for(int i=1;i<len;i++)
        {
            if(candies[i]>max)
            {
                max=candies[i];
            }
        }
        for(int j=0;j<len;j++)
        {
           result.add(candies[j]+extraCandies>=max?true:false);
        }
        return result;
    }
}
