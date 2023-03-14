import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> integerMap = new Hashtable<>();
        //K = element, V = index

        integerMap.put(nums[0], 0);

        for(int i = 1; i < nums.length; i++) {
            Integer compliment = target - nums[i];
            Integer complimentIndex = integerMap.get(compliment);
            if(complimentIndex != null) {
                //found the compliments that sum to target
                return new int[]{complimentIndex, i};
            }
            integerMap.put(nums[i], i);
        }
        return null;//shouldn't happen
    }
}
