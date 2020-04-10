

public class HistoryList {
	public void history() {
		for (int i=0; i<MenuManager.Cash.size();i++) {
			System.out.print("Num : " + MenuManager.Cash.get(i).num + "Cash : " + MenuManager.Cash.get(i).Cash + "How : " + MenuManager.Cash.get(i).HowIoS + " " + MenuManager.Cash.get(i).How + "\n");
		}
	}
}