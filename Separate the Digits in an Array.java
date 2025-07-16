class Solution {
    public int[] separateDigits(int[] nums) {
       List<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            List<Integer> temp = new ArrayList<>();
            while (num > 0) {
                temp.add(num % 10);
                num /= 10;
            }
            for (int j = temp.size() - 1; j >= 0; j--) {
                ans.add(temp.get(j));
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}
