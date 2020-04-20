import java.util.Scanner;
import cash.Bankbook;
import cash.CashL;
import cash.walletList;

public class CashInsert {
	
	static Scanner spsc;

	public void input(int a) {
		
		int kind = 0;
		CashL money1;
		Bankbook money2;
		spsc = new Scanner(System.in);
		
		while(true) {
			System.out.print("Press 1 for Cash \npress 2 for Bankbook\n");
			kind = spsc.nextInt();
			if (kind ==1) {
				money1 = new CashL();
				money1.getCashInfo(a, MenuManager.num, walletList.Cash);
				MenuManager.Cash.add(money1);
				break;
			}
			else if (kind == 2) {
				money2 = new Bankbook();
				money2.getCashInfo(a, MenuManager.num, walletList.Bankbook);
				MenuManager.Cash.add(money2);
				break;
			}
			else {
				System.out.print("Please type 1 or 2");
			}
		}
	}
}