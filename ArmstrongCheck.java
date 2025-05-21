import java.util.Scanner;
public class ArmstrongCheck {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number:");
		int a= sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		while(b!=0) {
			int temp=b;
			b=b%a;
			a=temp;
		}
		System.out.println("GCD is: " + a );
		sc.close();
	}

}
