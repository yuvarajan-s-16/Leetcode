class Solution {
    public boolean hasAlternatingBits(int n) {
        int re=n%2,c=n%2;
        while(n!=0)
        {
            if(c!=re)
            {
              return false;
            }
            c^=1;
            n/=2;
            re=n%2;
        }
        return true;
    }
}
