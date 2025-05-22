import java.util.Scanner;
public class Main1{
public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1=scanner.nextInt();
    System.out.print("Enter second number: ");
    int num2=scanner.nextInt();
    System.out.println("Choose an operation: +,-,*,/ ");
    char operation=scanner.next().charAt(0);
    int result;
    switch(operation){
        case '+':
        result=num1+num2;
        System.out.println("Result: " +result);
        break;
        case '-':
        result=num1-num2;
        System.out.println("Result: " +result);
        break;
        case '*':
        result=num1*num2;
        System.out.println("Result:" +result);
        break;
        case '/':
        if(num2!=0){
        result=num1/num2;
        System.out.println("Result: " +result);
        } else {
        System.out.println("Error");
        }
        break;
        default:
        System.out.println("Invalid Operation");

    }
    scanner.close();

}
}