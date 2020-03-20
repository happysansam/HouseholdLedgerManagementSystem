
public class Balance {

	int a=0;
	public void input(){
		a=MenuManager.num;
		for(int b=0;b<=a;b++) {
				MenuManager.Balance=(MenuManager.Balance-MenuManager.Spendingsp[b]);
				MenuManager.Balance=(MenuManager.Balance+MenuManager.Incomeic[b]);
		}
		System.out.printf("Balance : %d\n", MenuManager.Balance);
	}
}
