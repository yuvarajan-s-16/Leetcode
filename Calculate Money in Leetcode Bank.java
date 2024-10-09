class Solution {
    public int totalMoney(int n) {
        int sum=0,j=1,c=2;
        for(int i=1;i<=n;i++)
        {
            if(i%7!=0)
            {
                sum+=j;
                j++;
            }
            else
            {
                sum+=j;
                j=c;
                c+=1;
            }
        }
        return sum;
    }
}
