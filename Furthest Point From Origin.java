class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int c=0,d=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='R') c++;
            else if(moves.charAt(i)=='L') c--;
            else d++;
        }
        return Math.abs(c)+d;
    }
}
