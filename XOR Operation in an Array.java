class Solution {
    public int xorOperation(int n, int start) {
        int xor=0;
        for(int i=0;i<n;i++)
        {
            xor^=start;
            start+=2;
        }
        return xor;
    }
}
