public class Solution {
    public int removeDuplicates(int[] nums){
        int n=nums.length;
        if(n==0) {
            return 0;
        }
        int uniqueIndex=0;
        for(int i=1; i<n; i++){
            if(nums[i] != nums[uniqueIndex]){
                uniqueIndex++;
                nums[uniqueIndex]=nums[i];
            }
        }
        return uniqueIndex+1;

    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 1, 2, 2, 3, 3, 4};
        int newLength = sol.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    
}
