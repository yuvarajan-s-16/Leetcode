class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)return false;
        int and=n&n-1;
        if(and==0)return true;
        return false;
    }
}
