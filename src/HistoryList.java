public class HistoryList {
	public void history() {
		for (int i=0; i<MenuManager.Cash.size();i++) {
			MenuManager.Cash.get(i).printInfo();
		}
	}
}