public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
         if (isArmstrong(num))
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
    public static boolean isArmstrong(int num){
        int original=num;
        int sum=0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        return sum==original;

    }
}
