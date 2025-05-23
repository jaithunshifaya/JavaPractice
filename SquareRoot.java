import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        double guess = num / 2;

        
        for (int i = 0; i < 10; i++) {
            guess = (guess + num / guess) / 2;
        }

        System.out.println("Approximate Square Root: " + guess);
        sc.close();
    }
}
