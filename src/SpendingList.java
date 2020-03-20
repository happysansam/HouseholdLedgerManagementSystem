import java.util.Scanner;
public class SpendingList {
	
	public static int sp;
	public static String howS;
	static Scanner spsc;
	static Scanner sch;
	
	public void input() {
		spsc = new Scanner(System.in);
		sch = new Scanner(System.in);
		
		System.out.println("Please input spending amount :");
		sp = spsc.nextInt();
		
		System.out.println("How :");
		howS = sch.nextLine();
		
		System.out.printf("%dwon, to %s\n", sp, howS);
	}
}