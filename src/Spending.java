import java.util.Scanner;
public class Spending {
	public void input() {
		Scanner sc = new Scanner(System.in);
		Scanner sh = new Scanner(System.in);
		int sp;
		String howS;
		System.out.println("Please input spending amount :");
		sp = sc.nextInt();
		System.out.println("How :");
		howS = sh.nextLine ();
		System.out.printf("%dwon, to %s", sp, howS);
	}
}