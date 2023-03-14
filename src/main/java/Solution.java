import java.util.LinkedList;
import java.util.List;

public class Solution {
    /*
    This brute force solution contains nested for loops, which should tell us that this is probably running in O(n^2)
    time. The outer loop iterates through the array and the inner loop considers that element against all others.
    If two numbers which sum up to the target are found, we return those elements. If we complete the loop without
    finding two such numbers, we return null. (This doesn't happen as the constraints of the problem indicate every
    test case will have a valid solution).
     */
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
        return null; //never happens.
    }
}
