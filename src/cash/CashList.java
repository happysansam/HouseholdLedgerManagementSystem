package cash;

import java.util.Scanner;

public class CashList {

	public walletList wallet = walletList.Cash;
	public int num;
	public int Cash;
	public String How;
	public String HowIoS;
	
	public walletList getWallet() {
		return wallet;
	}
	public void setWallet(walletList wallet) {
		this.wallet = wallet;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getCash() {
		return Cash;
	}
	public void setCash(int cash) {
		Cash = cash;
	}
	public String getHow() {
		return How;
	}
	public void setHow(String how) {
		How = how;
	}
	public String getHowIoS() {
		return HowIoS;
	}
	public void setHowIoS(String howIoS) {
		HowIoS = howIoS;
	}

	
	public CashList() {}
	
	public CashList(walletList kind) {
		this.wallet = kind;
	}

	public CashList(int num, int Cash, String How, String HowIoS) {
		this.num=num;
		this.Cash = Cash;
		this.How = How;
		this.HowIoS=HowIoS;
	}
	
	public void getCashInfo(int a, int num, walletList wallet) {
		this.wallet = wallet;
		Scanner input = new Scanner(System.in);
		
		int Cash;
		String How, HowIoS;

		this.num = num;
		System.out.println("Please input amount of cash :");
		this.Cash= input.nextInt();
		input = new Scanner(System.in);
		System.out.println("How :");
		this.How = input.nextLine();

		if (a==1) {
			this.HowIoS = "Spending";
		}
		else if (a==2) {
			this.HowIoS = "Income";
		}
	}
	
	public void printInfo() {
		System.out.println("Num : " + num + " " + wallet + " Amount : " + Cash + " How : " + HowIoS + " " + How);
	}
}