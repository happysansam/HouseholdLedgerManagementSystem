
import java.util.Scanner;
public class CashInsert {

	static Scanner spsc;
	static Scanner sch;

	public void input(int a) {
		CashList money = new CashList();
		spsc = new Scanner(System.in);
		sch = new Scanner(System.in);
		
		money.num=Example.num;
		System.out.println("Please input spending amount :");
		money.Cash= spsc.nextInt();
		System.out.println("How :");
		money.How = sch.nextLine();

		if (a==1) {
			money.HowIoS = "Spending";
		}
		else if (a==2) {
			money.HowIoS = "Income";
		}
		Example.Cash.add(money);
	}
}