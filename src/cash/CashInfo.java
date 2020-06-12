package cash;

public interface CashInfo {
	public void getCashInfo(int a, int num, walletList wallet);
	public String getHowIoS();
	public String getHow();
	public int getCash();
	public int getNum();
	public void setNum(int i);
	public walletList getWallet();
	public void printInfo();
}
