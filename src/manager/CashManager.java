package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import cash.Bankbook;
import cash.CashInfo;
import cash.CashL;
import cash.CashList;
import cash.walletList;
import exception.CashException;

public class CashManager implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2715230278478154011L;


	ArrayList<CashInfo> Cash = new ArrayList<CashInfo>();
	transient Scanner sc;
	CashManager(Scanner sc) {
		this.sc = sc;
	}

	public void setScanner(Scanner sc) {
		this.sc = sc;
	}


	public void input(int a) {
		CashInfo cashinfo;

		int kind = 0;
		sc = new Scanner(System.in);

		while(true) {
			try {
				System.out.print("Press 1 for Cash \npress 2 for Bankbook\n");
				kind = sc.nextInt();
				if (kind ==1) {
					cashinfo = new CashL();
					cashinfo.getCashInfo(a, MenuManager.num, walletList.Cash);
					Cash.add(cashinfo);
					break;
				}
				else if (kind == 2) {
					cashinfo = new Bankbook();
					cashinfo.getCashInfo(a, MenuManager.num, walletList.Bankbook);
					Cash.add(cashinfo);
					break;
				}
				else {
					System.out.print("Please type 1 or 2");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please type an integer 1 or 2!");
				if(sc.hasNext()){
					sc.next();
				}
				kind = -1;
			}
		}

	}

	public void BalanceCheck() {
		for (int i=0; i<Cash.size();i++) {
			if (Cash.get(i).getHowIoS()=="Spending") {
				MenuManager.Balance = MenuManager.Balance - Cash.get(i).getCash();
			}
			else if (Cash.get(i).getHowIoS()=="Income") {
				MenuManager.Balance = MenuManager.Balance + Cash.get(i).getCash();
			}
		}
		System.out.print("Balance : " + MenuManager.Balance + "\n");
	}

	public void delete() {
		sc = new Scanner(System.in);
		System.out.print("List number : ");
		int a = sc.nextInt();
		int index = array(a);

		if (index >= 0) {
			Cash.remove(index);
			System.out.print("the list " + a + " is deleted\n");
		}
		else {
			System.out.print("the list has not found\n");
		}

	}

	public int array(int a) {
		int index = -1;
		for(int i = 0; i < Cash.size(); i++) {
			if (Cash.get(i).getNum() == a) {
				index = i;
				break;
			}
		}

		for(int i = index; i <Cash.size(); i++) {
			int b = Cash.get(i).getNum();
			Cash.get(i).setNum(--b);
		}
		MenuManager.num--;
		return index;
	}

	public void edit() {
		sc = new Scanner(System.in);
		System.out.print("List number : ");
		int a = sc.nextInt();
		int index = -1;
		for(int i = 0; i < Cash.size(); i++) {
			CashList cash = (CashList) Cash.get(i);
			if (Cash.get(i).getNum() == a) {
				while (index != 4) {
					try {
						showEditMenu();
						sc = new Scanner(System.in);;
						index = sc.nextInt();
						sc = new Scanner(System.in);
						switch (index) {
						default :
							System.out.println("Please select one number between 1 - 4:");
							continue;
						case 1:
							System.out.println("Please type amount of money : ");
							try {
								cash.setCash(sc.nextInt());
							} catch (CashException e1) {
								System.out.println("Please type more than 10 won.");
							}
							continue;
						case 2:
							System.out.println("Please type how : ");
							String How = sc.nextLine();
							cash.setHow(How);
							continue;
						case 3:
							System.out.print("please type 1 if you Spend money or type 2 if you get money");
							int b = sc.nextInt();
							if (b==1) {
								cash.setHowIoS("Spending");
							}
							else if (b==2) {
								cash.setHowIoS("Income");
							}
							continue;
						case 4:
							break;
						}
					}
					catch(InputMismatchException e) {
						System.out.println("Please type an integer 1 to 4!");
						if(sc.hasNext()){
							sc.next();
						}
						index = -1;
					}
				}
				break;
			}
		}
	}
	
	public int size() {
		return Cash.size();
	}
	public CashInfo get(int index) {
		return Cash.get(index);
	}

	public void showEditMenu() {
		System.out.println("*** Householde Ledger Management Sysytem Edit Menu ***");
		System.out.println("1. Cash\n2. How\n3. Spending or Income\n4. Exit\nSelect one number between 1 - 4 :");
	}

	public void history() {
		if (Cash.size() != 0) {
			for (int i=0; i<Cash.size();i++) {
				if (Cash.get(i).getWallet()==walletList.Secret) {
				}
				else {
					Cash.get(i).printInfo();
				}
			}
		}
	}
}
