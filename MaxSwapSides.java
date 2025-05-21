import java.util.*;

public class MaxSwapSides {
    public static void main(String[] args) {
        int[] arr = {17, 94, 1, 6, 2, 55, 80};
        Arrays.sort(arr);
        int[] result = new int[arr.length];
        int left = 0, right = arr.length - 1, idx = arr.length - 1;

        while (left <= right) {
            if ((arr.length - idx) % 2 == 1)
                result[left++] = arr[idx--];
            else
                result[right--] = arr[idx--];
        }

        System.out.println(Arrays.toString(result));
    }
}
