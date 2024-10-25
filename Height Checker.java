class Solution {
    public int heightChecker(int[] heights) {
        int c=0,n=heights.length;
        int[] copy=new int[n];
        System.arraycopy(heights,0,copy,0,n);
        Arrays.sort(heights);
        for(int i=0;i<n;i++)
        {
            if(heights[i]!=copy[i])
            {
                c++;
            }
        }
        return c;
    }
}
