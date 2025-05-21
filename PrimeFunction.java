import java.util.Scanner;

public class PrimeFunction {
    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(isPrime(num))
            System.out.println(num + " is Prime");
        else
            System.out.println(num + " is Not Prime");

        sc.close();
    }
}
