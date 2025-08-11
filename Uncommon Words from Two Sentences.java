class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str1=s1.split(" ");
        String[] str2=s2.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:str1)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:str2)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        ArrayList<String> arr=new ArrayList<>();
        for(String str:map.keySet())
        {
           if(map.get(str)==1)
           {
              arr.add(str);
           }
        }
        String[] array = arr.toArray(new String[0]);

        return array;
    }
}
