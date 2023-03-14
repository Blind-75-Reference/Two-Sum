import java.util.Hashtable;
import java.util.Map;

public class Solution {
    /*
    This solution uses the speed of looking up keys in HashTable to achieve a very efficient time complexity. We add
    each element in the array to the table, where the index is the value, and the element is the key. As we loop
    once through the array, we consider what number would compliment each element to sum up to the target. We check if
    that number is already present in the HashTable. If it is, we return the indices of the two numbers. Otherwise, we
    add it and continue. If we complete the loop without finding the two numbers, we return null. The constraints of
    the problem indicate there will always be a valid solution, so this shouldn't occur.
     */
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
