class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int j=0;j<=n;j++)
        {
            int i=j,c=0;
            while(i!=0)
            {
                if(i%2==1)
                {
                    c++;
                }
                i/=2;
            }
            arr[j]=c;
        }
        return arr;

    }
}


//another method
/*
 int ans[] = new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            ans[i] = ans[i/2] + (i%2);
        }
        return ans;
*/
