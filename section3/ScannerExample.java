import java.util.Scanner;
public class ScannerExample {
	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);
		System.out.println( "Enter the integer" );
		int num = scanner.nextInt();
		System.out.println(num);
	}
}