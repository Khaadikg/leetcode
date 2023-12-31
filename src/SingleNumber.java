import java.util.*;
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
        System.out.println(singleNumber(new int[]{2, 2, 1, 3, 3}));
        System.out.println(singleNumber(new int[]{2, 2, 1, 3, 3, 1, 4}));
        System.out.println(singleNumber(new int[]{9, 4, 2, 2, 1, 3, 3, 1, 4}));
    }
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map =  new HashMap<>();
//        int out;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.remove(nums[i]);
            } else {
                map.put(nums[i], 1);
            }
        }
        return map.keySet().stream().findFirst().orElse(1);
    }
}
