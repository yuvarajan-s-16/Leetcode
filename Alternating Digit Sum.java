class Solution {
    public int alternateDigitSum(int n) {
        String s=Integer.toString(n);
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                sum+=s.charAt(i)-'0';
            }
            else
            {
                sum-=s.charAt(i)-'0';
            }
        }
        return sum;
    }
}
