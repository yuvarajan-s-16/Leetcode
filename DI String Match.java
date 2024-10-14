class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length(),j=0;
        int[] arr=new int[n+1];
        int k=n;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I')
            {
                arr[i]=j;
                j++;
            }
            else
            {
                arr[i]=k;
                k--;
            }
        }
        if(s.charAt(n-1)=='I')
        {
            arr[n]=j;
        }
        if(s.charAt(n-1)=='D')
        {
            arr[n]=k;
        }
        return arr;
    }
}
