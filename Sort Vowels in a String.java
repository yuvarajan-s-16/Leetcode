class Solution {
    public String sortVowels(String s) {
        ArrayList<Integer> arr = new ArrayList<>();
        String vowels = "aeiouAEIOU";

        for (char ch : s.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                arr.add((int) ch);
            }
        }

        int[] sorted = new int[arr.size()];
        int j=0;
        for(int num:arr)
        {
            sorted[j++]=num;
        }
        Arrays.sort(sorted);

        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (char ch : s.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                sb.append((char) sorted[i++]);
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
