class Solution {
    public int countNegatives(int[][] grid) {
        int l=grid[0].length,c=0,total=0;
        for(int[] row:grid)
        {
            int s=0,e=l-1;
            while(s<=e)
            {
                int mid=s+(e-s)/2;
                if(row[mid]<0)
                {
                   c=l-mid;
                   e=mid-1;
                }
                else
                {
                    s=mid+1;
                }
            }
            total+=c;
        }
        return total;
    }
}
