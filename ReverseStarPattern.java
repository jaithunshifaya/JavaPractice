import java.util.Scanner;

public class ReverseStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); 
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); 
            }

            System.out.println(); 
        }

        scanner.close();
    }
}
