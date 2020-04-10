
import java.util.Scanner;
import java.util.ArrayList;

public class MenuManager {
	static ArrayList<CashList> Cash = new ArrayList<CashList>();
	public static int num = 1;
	public static int Balance;
	static Scanner sc;
	static CashInsert  Insert = new CashInsert();
	static Balance balance = new Balance();
	static HistoryList List = new HistoryList();
	static EditList Edit = new EditList();
	static DeleteList Delete = new DeleteList();
	
	public static void main(String[] args) {
		int a= 0;
		while(true) {
			if(a==6) {
				break;
			}
			
			Balance = 0;
			
			System.out.println("*** Householde Ledger Management Sysytem Menu ***");
			balance.BalanceCheck();
			System.out.println("1. Spending\n2. Income\n3. History\n4. Delete\n5. Edit\n6. Exit\nSelect one number between 1 - 6:");
			
			sc = new Scanner(System.in);
			a = sc.nextInt();
			
			switch(a) {
			default :
				System.out.println("There's a problem. Please select one number between 1 - 6. Going back to starting point.");
				continue;
			case 1:
				Insert.input(a);
				num++;
				continue;
			case 2:
				Insert.input(a);
				num++;
				continue;
			case 3:
				List.history();
				continue;
			case 4:
				Delete.delete();
				continue;
			case 5:
				Edit.edit();
				continue;
			case 6:
				break;
			}
		}
	}
}
