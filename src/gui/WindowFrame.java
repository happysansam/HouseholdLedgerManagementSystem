package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.CashManager;

public class WindowFrame extends JFrame{
	CashManager cashManager;
	MenuSelection menuselection;
	CashInput cashinput;
	HistoryViewer historyviewer;
	

	public WindowFrame(CashManager cashManager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.cashManager = cashManager;
		menuselection  = new MenuSelection(this);
		cashinput  = new CashInput(this);
		historyviewer  = new HistoryViewer(this, this.cashManager);
		
		this.add(menuselection);
		this.setVisible(true);
	}
	public MenuSelection getMenuselection() {
		return menuselection;
	}
	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}
	public CashInput getCashinput() {
		return cashinput;
	}
	public void setCashinput(CashInput cashinput) {
		this.cashinput = cashinput;
	}
	public HistoryViewer getHistoryviewer() {
		return historyviewer;
	}
	public void setHistoryviewer(HistoryViewer historyviewer) {
		this.historyviewer = historyviewer;
	}

}
