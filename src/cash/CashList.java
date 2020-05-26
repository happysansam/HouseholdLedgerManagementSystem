package cash;

import java.io.Serializable;

import exception.CashException;

public abstract class CashList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -551678701732555250L;
	private walletList wallet = walletList.Cash;
	private int num;
	private int Cash;
	private String How;
	private String HowIoS;
	
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
	public void setCash(int cash) throws CashException {
		if(cash<10) {
			throw new CashException();
		}
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
}
