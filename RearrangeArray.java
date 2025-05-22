public class RearrangeArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2}; 
        rearrangeArray(nums);
        System.out.print("Output: ");
        for (int num : nums)
            System.out.print(num + " ");
    }

    
    static void rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] even = new int[n];
        int[] odd = new int[n];
        int[] evenPos = new int[n];
        int[] oddPos = new int[n];
        int e = 0, o = 0;

        
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                even[e] = nums[i];
                evenPos[e] = i;
                e++;
            } else {
                odd[o] = nums[i];
                oddPos[o] = i;
                o++;
            }
        }

        
        sortAscending(even, e);
        sortDescending(odd, o);

        
        for (int i = 0; i < e; i++)
            nums[evenPos[i]] = even[i];

        for (int i = 0; i < o; i++)
            nums[oddPos[i]] = odd[i];
    }

    
    static void sortAscending(int[] arr, int length) {
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    
    static void sortDescending(int[] arr, int length) {
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++)
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}
