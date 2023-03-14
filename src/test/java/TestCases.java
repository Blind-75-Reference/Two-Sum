
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCases {
    Solution solution = new Solution();

    @Test
    public void testCase1() {
        int[] answer = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        Assertions.assertArrayEquals(new int[]{0,1}, answer);
    }

    @Test
    public void testCase2() {
        int[] answer = solution.twoSum(new int[]{3,2,4}, 6);
        Assertions.assertArrayEquals(new int[]{1,2}, answer);
    }

    @Test
    public void testCase3() {
        int[] answer = solution.twoSum(new int[]{3,3}, 6);
        Assertions.assertArrayEquals(new int[]{0,1}, answer);
    }

    @Test
    public void testCase4() {
        int[] answer = solution.twoSum(new int[]{-10, 100, 150, 35635, 0, -65000, -5}, -15);
        Assertions.assertArrayEquals(new int[]{0,6}, answer);
    }

    @Test
    public void testCase5() {
        int[] answer = solution.twoSum(new int[]{111111, 11111, 1111, 111, 11, 1, -1, -11}, 10);
        Assertions.assertArrayEquals(new int[]{4,6}, answer);
    }

}
