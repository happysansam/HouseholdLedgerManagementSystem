import java.util.Scanner;
public class MenuManager {
	
	public static int num=0;
	public static int Balance;
	public static int Spendingsp[]=new int[999];
	public static String SpendinghowS[]=new String[999];
	public static int Incomeic[]=new int[999];
	public static String IncomehowS[]=new String[999];
	static Scanner sc; 
	static SpendingList SpendingOne = new SpendingList();
	static IncomeList IncomeOne = new IncomeList();
	static Balance BalanceOne = new Balance();
	static HistoryList HistoryOne= new HistoryList();
	
	public static void main(String[] args) {
		while(true) {
			if (num!=0) {
				BalanceOne.input();
			}
		
			int a=0;
			Balance = 0;
		
			System.out.println("*** Householde Ledger Management Sysytem Menu\n1. Spending\n2. Income\n3. Balance\n4. History\n5. Exit\nSelect one number between 1 - 5:");
		
			sc = new Scanner(System.in);
			a = sc.nextInt();
		
			switch(a) {
			default :
				System.out.println("There's a problem. Please select one number between 1 - 5. Going back to starting point.");
				continue;
			case 1:
				SpendingOne.input();
				Spendingsp[num]=SpendingList.sp;
				SpendinghowS[num]=SpendingList.howS;
				num++;
				continue;
			case 2:
				IncomeOne.input();
				Incomeic[num]=IncomeList.ic;
				IncomehowS[num]=IncomeList.howS;
				num++;
				continue;
			case 3:
				main(args);
			case 4:
				HistoryOne.input();
				continue;
			case 5:
				break;
			}
		break;
		}
	}
}
