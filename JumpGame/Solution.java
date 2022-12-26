public class Solution {
    public static boolean canJump(int[] nums) {
        int pos = 0;
        int maxJump = 0;
        while (pos <= maxJump && maxJump < nums.length - 1) {
            maxJump = Math.max(maxJump, pos + nums[pos]);
            pos += 1;
        }
        return maxJump >= nums.length - 1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 1, 4 };
        int[] num2 = { 3, 0, 8, 2, 0, 0, 1 };
        int[] num3 = { 3, 2, 1, 0, 4 };

        System.out.println(canJump(nums));
        System.out.println(canJump(num2));
        System.out.println(canJump(num3));
    }
}
