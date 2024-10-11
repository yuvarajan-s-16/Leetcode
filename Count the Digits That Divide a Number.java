class Solution {
    public int countDigits(int num) {
        int temp=num,count=0;
        while(num!=0)
        {
            if(temp%(num%10)==0)
            {
                count++;
            }
            num/=10;
        }
        return count;
    }
}
