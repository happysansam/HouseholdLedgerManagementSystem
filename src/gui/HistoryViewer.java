package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import cash.CashInfo;
import manager.CashManager;

public class HistoryViewer extends JPanel {
	WindowFrame frame;
	CashManager cashManager;
	
	public HistoryViewer(WindowFrame frame, CashManager cashManager) {
		this.frame = frame;
		this.cashManager = cashManager;
		
		System.out.println("***"+ cashManager.size() + "***");
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("No.");
		model.addColumn("In/Out");
		model.addColumn("Amount");
		model.addColumn("Purpose");
		model.addColumn("wallet");
		
		for (int i = 0; i<cashManager.size(); i++) {
			Vector row = new Vector();
			CashInfo ci = cashManager.get(i);
			row.add(ci.getNum());
			row.add(ci.getHowIoS());
			row.add(ci.getCash());
			row.add(ci.getHow());
			row.add(ci.getWallet());
			model.addRow(row);
		}

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}


}
