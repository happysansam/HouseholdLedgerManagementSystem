import java.util.Scanner;

public class DeleteList {
	public void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.print("List number : ");
		int a = sc.nextInt();
		int index = -1;
		for(int i = 0; i < MenuManager.Cash.size(); i++) {
			if (MenuManager.Cash.get(i).num == a) {
				index = i;
				break;
			}
		}
		
		for(int i = index; i <MenuManager.Cash.size(); i++) {
			MenuManager.Cash.get(i).num = MenuManager.Cash.get(i).num -1;
		}
		MenuManager.num--;
		
		if (index >= 0) {
			MenuManager.Cash.remove(index);
			System.out.print("the list " + a + " is deleted");
		}
		else {
			System.out.print("the list has not found");
		}
		
	}
}
