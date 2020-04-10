

public class Balance {
	public void BalanceCheck() {
		for (int i=0; i<Example.Cash.size();i++) {
			if (Example.Cash.get(i).HowIoS=="Spending") {
				Example.Balance = Example.Balance - Example.Cash.get(i).Cash;
			}
			else if (Example.Cash.get(i).HowIoS=="Income") {
				Example.Balance = Example.Balance + Example.Cash.get(i).Cash;
			}
		}
		System.out.print("Balance : " + Example.Balance + "\n");
	}
}
