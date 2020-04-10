

public class Balance {
	public void BalanceCheck() {
		for (int i=0; i<MenuManager.Cash.size();i++) {
			if (MenuManager.Cash.get(i).HowIoS=="Spending") {
				MenuManager.Balance = MenuManager.Balance - MenuManager.Cash.get(i).Cash;
			}
			else if (MenuManager.Cash.get(i).HowIoS=="Income") {
				MenuManager.Balance = MenuManager.Balance + MenuManager.Cash.get(i).Cash;
			}
		}
		System.out.print("Balance : " + MenuManager.Balance + "\n");
	}
}
