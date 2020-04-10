import java.util.Scanner;

public class EditList {
	public void edit() {
		Scanner sc = new Scanner(System.in);
		Scanner scL = new Scanner(System.in);
		System.out.print("List number : ");
		int a = sc.nextInt();
		int index = -1;
		for(int i = 0; i < MenuManager.Cash.size(); i++) {
			CashList cash = MenuManager.Cash.get(i);
			if (MenuManager.Cash.get(i).num == a) {
				while (index != 4) {
					System.out.println("*** Householde Ledger Management Sysytem Edit Menu ***");
					System.out.println("1. Cash\n2. How\n3. Spending or Income\n4. Exit\nSelect one number between 1 - 4 :");
					index = sc.nextInt();
					switch (index) {
					default :
						System.out.println("Please select one number between 1 - 4:");
						continue;
					case 1:
						System.out.println("Please type amount of money : ");
						cash.Cash = sc.nextInt();
						continue;
					case 2:
						System.out.println("Please type how : ");
						cash.How = scL.nextLine();
						continue;
					case 3:
						System.out.print("please type 1 if you Spend money or type 2 if you get money");
						int b = sc.nextInt();
						if (b==1) {
							cash.HowIoS = "Spending";
						}
						else if (b==2) {
							cash.HowIoS = "Income";
						}
						continue;
					case 4:
						break;
					}
				}
				break;
			}
		}
	}
}
