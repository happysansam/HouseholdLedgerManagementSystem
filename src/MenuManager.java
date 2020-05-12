import java.util.Scanner;
import cash.CashInfo;
import java.util.ArrayList;

public class MenuManager {
	static ArrayList<CashInfo> Cash = new ArrayList<CashInfo>();
	public static int num = 1;
	public static int Balance;
	static Scanner sc;
	
	public static void main(String[] args) {
		int a= 0;
		while(true) {
			if(a==6) {
				break;
			}
			
			Balance = 0;
			
			ShowMenu();
			
			sc = new Scanner(System.in);
			a = sc.nextInt();
			
			switch(a) {
			default :
				System.out.println("There's a problem. Please select one number between 1 - 6. Going back to starting point.");
				continue;
			case 1:
				CashManager.input(a);
				num++;
				continue;
			case 2:
				CashManager.input(a);
				num++;
				continue;
			case 3:
				CashManager.history();
				continue;
			case 4:
				CashManager.delete();
				continue;
			case 5:
				CashManager.edit();
				continue;
			case 6:
				break;
			}
		}
	}
	public static void ShowMenu() {
		System.out.println("*** Householde Ledger Management Sysytem Menu ***");
		CashManager.BalanceCheck();
		System.out.println("1. Spending\n2. Income\n3. History\n4. Delete\n5. Edit\n6. Exit\nSelect one number between 1 - 6:");
	}
}