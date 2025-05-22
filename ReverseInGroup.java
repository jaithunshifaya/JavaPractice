public class ReverseInGroup {
    public static void reverseInGroups(int[] arr, int k) {
        for (int i = 0; i < arr.length; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, arr.length - 1);

            while (left < right) {
                int temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 3;

        reverseInGroups(arr, k);

        for (int val : arr)
            System.out.print(val + " ");
    }
}
