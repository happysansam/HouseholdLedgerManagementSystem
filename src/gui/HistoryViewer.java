package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HistoryViewer extends JPanel {
	WindowFrame frame;
	public HistoryViewer(WindowFrame frame) {
		this.frame = frame;
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("No.");
		model.addColumn("In/Out");
		model.addColumn("Amount");
		model.addColumn("Purpose");
		model.addColumn("wallet");

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}


}
