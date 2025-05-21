public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);
            if (nums[index] < 0) {
                System.out.println("Duplicate: " + index);
                break;
            }
            nums[index] = -nums[index];
        }
    }
}
