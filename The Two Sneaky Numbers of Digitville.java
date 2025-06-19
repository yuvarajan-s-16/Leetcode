import java.util.*;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                list.add(num);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);  
        }

        return result;
    }
}
