
import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int length = 0;
        try {
            while (true) {
                input.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
           
        }

        System.out.println("Length of the string: " + length);
        sc.close();
    }
}
