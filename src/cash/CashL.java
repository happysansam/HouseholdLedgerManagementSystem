package cash;

import java.util.Scanner;

public class CashL extends CashList implements CashInfo{
	public void getCashInfo(int a, int num, walletList wallet) {
		setWallet(wallet);
		Scanner input = new Scanner(System.in);

		int p;
		String How;

		setNum(num);
		System.out.println("Please input amount of cash :");
		setCash(input.nextInt());
		input = new Scanner(System.in);
		
		while(true) {
			System.out.print("If you don't want to save where to use press 1 or do press 2 : ");
			p = input.nextInt();
			if(p == 1) {
				setHow("");
				break;
			}
			else if (p == 2) {
				System.out.println("How :");
				input = new Scanner(System.in);
				How = input.nextLine();
				setHow(How);
				break;
			}
			else {
				System.out.print("Please press 1 or 2");
				continue;
			}
		}
		
		if (a==1) {
			setHowIoS("Spending");
		}
		else if (a==2) {
			setHowIoS("Income");
		}
	}
	public void printInfo() {
		System.out.println("Num : " + getNum() + " " + getWallet() + " Amount : " + getCash() + " How : " + getHowIoS() + " " + getHow());
	}
}
