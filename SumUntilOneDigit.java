public class SumUntilOneDigit {
    public static int digitalRoot(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;

        while (sum >= 10) {
            int temp = 0;
            while (sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }
            sum = temp;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Digital Root: " + digitalRoot(nums));
    }
}
