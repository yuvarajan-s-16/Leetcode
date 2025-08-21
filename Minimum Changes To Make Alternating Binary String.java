class Solution {
    public int minOperations(String s) {
        int l=s.length();
        int charzerosum=0;
        for(int i=0;i<l;i++)
        {
            charzerosum+=(i&1)^((int)s.charAt(i)-48);
        }
        int charonesum=l-charzerosum;
        return Math.min(charzerosum,charonesum);
    }
}
