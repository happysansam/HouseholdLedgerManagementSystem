import java.util.Scanner;
public class MenuManager {
	
	public static int num=0;
	public static int Balance=0;
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
		
		int a=0;
		sc = new Scanner(System.in);
		
		System.out.println("*** Householde Ledger Management Sysytem Menu\n1. Spending\n2. Income\n3. Balance\n4. History\n5. Exit\nSelect one number between 1 - 5:");
		
		a = sc.nextInt();
		switch(a) {
		default :
			System.out.println("There's a problem. Please select one number between 1 - 5. Going back to starting point.");
			main(args);
		case 1:
			SpendingOne.input();
			Spendingsp[num]=SpendingOne.sp;
			SpendinghowS[num]=SpendingOne.howS;
			main(args);
		case 2:
			IncomeOne.input();
			Incomeic[num]=IncomeOne.ic;
			IncomehowS[num]=IncomeOne.howS;
			main(args);
		case 3:
			BalanceOne.input();
			main(args);
		case 4:
			HistoryOne.input();
			main(args);
		case 5:
			break;
		}
		sc.close();
	}
}
