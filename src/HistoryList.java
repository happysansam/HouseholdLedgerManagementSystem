public class HistoryList {
	
	int a=0;
	int b=0;
	public void input() {
		a=MenuManager.num-1;
		for(;b<=a;b++) {
			if(MenuManager.Spendingsp[b]>0) {
				System.out.printf("Num %d, Spending, %dwon, to %s\n", b, MenuManager.Spendingsp[b], MenuManager.SpendinghowS[b]);
			}
			else if(MenuManager.Incomeic[b]>0) {
				System.out.printf("Num %d, Income, %dwon, to %s\n", b, MenuManager.Incomeic[b], MenuManager.IncomehowS[b]);
			}
		}
		MenuManager.BalanceOne.input();
	}
	HistoryList(){
		a=0;
		b=0;
	}
}