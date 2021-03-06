package cash;

import java.util.Scanner;

import exception.CashException;

public class Bankbook extends CashList implements CashInfo {

	public void getCashInfo(int a, int num, walletList wallet) {
		Scanner input = new Scanner(System.in);

		System.out.print("Do you want to hide this details? Please type 'Y' or 'N' : ");
		switch(input.nextLine()) {
		case "Y": case "y":
			setWallet(walletList.Secret);
			input = new Scanner(System.in);

			System.out.println("Please input amount of cash :");
			try {
				setCash(input.nextInt());
			} catch (CashException e1) {
				System.out.println("Please type more than 10 won.");
				getCashInfo(a,num,wallet);
			}
			setHow("");
			
			break;
		case "N": case "n":
			setWallet(wallet);
			input = new Scanner(System.in);

			System.out.println("Please input amount of cash :");
			try {
				setCash(input.nextInt());
			} catch (CashException e1) {
				System.out.println("Please type more than 10 won.");
				getCashInfo(a,num,wallet);
			}
			input = new Scanner(System.in);
			System.out.println("How :");
			setHow(input.nextLine());
		}
		setNum(num);
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

