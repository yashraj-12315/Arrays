// Given an array of integers nums and an integer target, 
// return indices of the two numbers such that they add up to target.
public class returnIndices {
    public static void returnindices(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((target == nums[i] + nums[j])) {
                    System.out.println("index " + i + " & index " + j);
                }

            }

        }
        System.out.println("Target not found");
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 91;
        returnindices(nums, target);
    }
}
