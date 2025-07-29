class Solution {
    public int largestAltitude(int[] gain) {
        int heighest=0;
        int sum=0;
        for(int i:gain)
        {
            sum+=i;
            if(heighest<sum)
            {
                heighest=sum;
            }
        }
        return heighest;
    }
}
