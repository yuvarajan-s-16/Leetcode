class Solution {
    public int minMaxDifference(int num) {
        String n=String.valueOf(num);
        char max=0;
        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i)!='9')
            {
               max=n.charAt(i);
               break;
            }
        }
        String maximum=n;
        if(max!=0)
        {
            maximum=n.replace(max,'9');
        }
        char min=0;
        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i)!='0')
            {
                min=n.charAt(i);
                break;
            }
        }
        String minimum=n;
        if(min!=0)
        {
          minimum=n.replace(min,'0');
        }
        return Integer.parseInt(maximum)-Integer.parseInt(minimum);
    }
}
