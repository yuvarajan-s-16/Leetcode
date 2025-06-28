class Solution {
    public String[] findWords(String[] arr) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";

        List<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            String[] a = arr[i].toLowerCase().split("");
            boolean flag = true;
            String temp = "";

            if (s1.contains(a[0]))
                temp = s1;
            else if (s2.contains(a[0]))
                temp = s2;
            else 
                temp = s3;
            
            for (int j = 1; j < a.length; j++) 
                if (!temp.contains(a[j])) {
                    flag = false;
                    break;
                }
            
            if (flag) 
                list.add(arr[i]);
        }

        return list.toArray(new String[list.size()]);
    }
}
