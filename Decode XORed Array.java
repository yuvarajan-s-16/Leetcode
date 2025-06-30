class Solution {
    public int[] decode(int[] encoded, int first) {
        int l=encoded.length;
        int[] arr=new int[l+1];
        arr[0]=first;
        for(int i=0;i<l;i++)
        {
           arr[i+1]=arr[i]^encoded[i];
        }
        return arr;
    }
}
