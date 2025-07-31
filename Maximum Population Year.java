class Solution {
    public int maximumPopulation(int[][] logs) {
        int n=logs.length;
        int[] arr=new int[2051];
        for(int k=0;k<n;k++)
        {
            arr[logs[k][0]]++;
            arr[logs[k][1]]--;
        }
        int maxpopulation=arr[1950],year=1950;
        for(int i=1951;i<2051;i++)
        {
            arr[i]+=arr[i-1];
            if(maxpopulation<arr[i])
            {
                year=i;
                maxpopulation=arr[i];
            }
        }
        return year;
    }
}
