package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{
	MenuSelection menuselection;
	CashInput cashinput;
	HistoryViewer historyviewer;

	

	public WindowFrame() {
		this.menuselection  = new MenuSelection(this);
		this.cashinput  = new CashInput(this);
		this.historyviewer  = new HistoryViewer(this);
		
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
		this.setupPanel(menuselection);
		this.setVisible(true);
	}
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
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
