class Solution {
    public int[] minOperations(String boxes) {
        int len=boxes.length(),sum=0;
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(boxes.charAt(j)=='1')
                {
                    sum+=(int)Math.abs(j-i);
                }
            }
            arr[i]=sum;
            sum=0;
        }
        return arr;
    }
}