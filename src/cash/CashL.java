package cash;

import java.util.Scanner;

public class CashL extends CashList {
	public void getCashInfo(int a, int num, walletList wallet) {
		this.wallet = wallet;
		Scanner input = new Scanner(System.in);

		int Cash, p;
		String How, HowIoS;

		this.num = num;
		System.out.println("Please input amount of cash :");
		this.Cash= input.nextInt();
		input = new Scanner(System.in);
		
		while(true) {
			System.out.print("If you don't want to save where to use press 1 or do press 2 : ");
			p = input.nextInt();
			if(p == 1) {
				this.How = "";
				break;
			}
			else if (p == 2) {
				System.out.println("How :");
				input = new Scanner(System.in);
				How = input.nextLine();
				this.How = How;
				break;
			}
			else {
				System.out.print("Please press 1 or 2");
				continue;
			}
		}
		
		if (a==1) {
			this.HowIoS = "Spending";
		}
		else if (a==2) {
			this.HowIoS = "Income";
		}
	}
}
