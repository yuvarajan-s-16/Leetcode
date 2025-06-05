class Solution {
    public int[] sortByBits(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]+=Integer.bitCount(arr[i])*100000;
        }
        Arrays.sort(arr);
        for(int j=0;j<arr.length;j++)
        {
            arr[j]=arr[j]%100000;
        }
        return arr;
    }
}
