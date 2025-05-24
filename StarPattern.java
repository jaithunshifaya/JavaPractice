import java.util.Scanner;
public class StarPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number of rows:");
		int n = scanner.nextInt();
		int start =1;
		for(int i=0; i<n; i++) {
			if(i%2==0) {
				start=1;
			}else {
				start=0;
			}
			for(int j=0; j<i; j++) {
				System.out.print(start);
				start=1-start;
				System.out.print(" ");
			}
			System.out.println("\n");
		}
		scanner.close();
		

	}

}
