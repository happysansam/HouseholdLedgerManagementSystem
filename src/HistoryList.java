

public class HistoryList {
	public void history() {
		for (int i=0; i<Example.Cash.size();i++) {
			System.out.print("Num : " + Example.Cash.get(i).num + "Cash : " + Example.Cash.get(i).Cash + "How : " + Example.Cash.get(i).HowIoS + " " + Example.Cash.get(i).How + "\n");
		}
	}
}