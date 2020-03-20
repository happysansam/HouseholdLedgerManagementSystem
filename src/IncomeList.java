import java.util.Scanner;
public class IncomeList {
	
	public static int ic;
	public static String howS;
	static Scanner icsc;
	static Scanner sch;
	
	public void input() {
		icsc = new Scanner(System.in);
		sch = new Scanner(System.in);
		
		System.out.println("Please input income amount :");
		ic = icsc.nextInt();
		
		System.out.println("How :");
		howS = sch.nextLine();
		
		System.out.printf("%dwon, to %s\n", ic, howS);
	}
}