public class MaxSumNonAdjacent {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 10, 7};
        System.out.println("Maximum sum of non-adjacent elements: " + findMaxSum(arr));
    }

    public static int findMaxSum(int[] arr) {
        if (arr.length == 0) return 0;
        if (arr.length == 1) return arr[0];

        int incl = arr[0]; 
        int excl = 0;      

        for (int i = 1; i < arr.length; i++) {
            int new_excl = Math.max(incl, excl); 
            incl = excl + arr[i]; 
            excl = new_excl;
        }

        return Math.max(incl, excl);
    }
}