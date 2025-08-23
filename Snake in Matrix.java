class Solution {
    public int finalPositionOfSnake(int n, List<String> commands){
        int c=0;
        for(String s:commands)
        {
            if(s.charAt(0)=='R') c+=1;
            else if(s.charAt(0)=='L') c-=1;
            else if(s.charAt(0)=='D') c+=n;
            else c-=n;
        }
        return c;
    }
}
