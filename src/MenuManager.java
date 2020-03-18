import java.util.Scanner;
public class MenuManager {
	public static void main(String[] args) {
		Spending name;
		name = new Spending();
		Scanner sc = new Scanner(System.in);
		System.out.println("*** Householde Ledger Management Sysytem Menu");
		System.out.println("1. Spending");
		System.out.println("2. Income");
		System.out.println("3. Balance");
		System.out.println("4. History");
		System.out.println("5. Exit");
		System.out.println("Select ont number between 1 - 5:");
		
		int a = sc.nextInt();
		
		if (a==1){
			name.input();
		}
	}
}
