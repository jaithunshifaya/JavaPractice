public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 5, 1, 2};
        int n = arr.length;
        int[] leaders = new int[n]; 
        int index = 0;

        int maxFromRight = arr[n - 1];
        leaders[index++] = maxFromRight;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leaders[index++] = maxFromRight;
            }
        }

        
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(leaders[i] + " ");
        }
    }
}
