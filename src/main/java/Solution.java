import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> elementList = new LinkedList<Integer>();

        elementList.add(nums[0]);

        for(int i = 1; i < nums.length; i++) {
            for(Integer element : elementList) {
                if (element + nums[i] == target) {
                    return new int[]{elementList.indexOf(element), i};
                }
            }
            elementList.add(nums[i]);
        }
        return null;
    }
}
