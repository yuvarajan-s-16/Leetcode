class Solution {
    public int maxFreqSum(String s) {
        int arr[]=new int[26];
        for(char ch:s.toCharArray())
        {
            arr[ch-'a']++;
        }
        int vmax=arr[0];
        int cmax=arr[1];
        for(int i=0;i<arr.length;i++)
        {
            if(i==0||i==4||i==8||i==14||i==20)
            {
                if(vmax<arr[i])
                {
                    vmax=arr[i];
                }
            }
            else
            {
                if(cmax<arr[i])
                {
                    cmax=arr[i];
                }
            }
        }
        return vmax+cmax;
    }
}
