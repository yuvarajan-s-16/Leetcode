class Solution {
    public int minimumMoves(String s) {
        int i=0,step=0;
        int l=s.length();
        while(i<l)
        {
            if(s.charAt(i)=='X')
            {
                i+=3;
                step++;
            }
            else
            {
                i++;
            }
        }
        return step;
    }
}
