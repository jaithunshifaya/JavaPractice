import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int count = 0;

        if (num == 0) count = 1; // special case

        while (num != 0) {
            num /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
        scanner.close();
    }
}
