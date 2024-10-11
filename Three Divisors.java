class Solution {
    public boolean isThree(int n) {
        int c=2;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
            if(c==4)
            {
                break;
            }
        }
        return c==3;
    }
}
