import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	
	public static int num = 1;
	public static int Balance;
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CashManager cashManager = getObject("cashmanager.ser");

		if (cashManager == null) {
			cashManager = new CashManager(sc);
		}
		else {
			cashManager.setScanner(sc);
		}
		
		selectMenu(sc, cashManager);
		putObject(cashManager, "cashmanager.ser");
	}

	public static void selectMenu(Scanner sc, CashManager cashManager) {
		int a= 0;
		while(true) {
			try {
				if(a==6) {
					break;
				}

				Balance = 0;

				ShowMenu(cashManager);

				sc = new Scanner(System.in);
				a = sc.nextInt();

				switch(a) {
				default :
					System.out.println("There's a problem. Please select one number between 1 - 6. Going back to starting point.");
					logger.log("Error");
					continue;
				case 1:
					cashManager.input(a);
					logger.log("Income");
					num++;
					continue;
				case 2:
					cashManager.input(a);
					logger.log("Spend");
					num++;
					continue;
				case 3:
					System.out.println(cashManager);
					cashManager.history();
					logger.log("History");
					continue;
				case 4:
					cashManager.delete();
					logger.log("Delete");
					continue;
				case 5:
					cashManager.edit();
					logger.log("Edit");
					continue;
				case 6:
					logger.log("Out");
					break;
				}
			}
			catch(InputMismatchException e){
				System.out.println("Please put an integer between 1 and 5!");
				if(sc.hasNext()) {
					sc.next();
				}
				a=-1;
			}
		}
	}
	
	public static CashManager getObject(String filename) {
		CashManager cashManager = null;
		

		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			cashManager = (CashManager) in.readObject();
			
			in.close();
			file.close();
			
		}catch (FileNotFoundException e) {
			return cashManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cashManager;
	}
	
	public static void putObject(CashManager cashManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(cashManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void ShowMenu(CashManager cashManager) {
		System.out.println("*** Householde Ledger Management Sysytem Menu ***");

		System.out.println("1. Spending\n2. Income\n3. History\n4. Delete\n5. Edit\n6. Exit\nSelect one number between 1 - 6:");
	}
}