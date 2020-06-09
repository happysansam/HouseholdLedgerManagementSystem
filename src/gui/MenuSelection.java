package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listener.ButtonAddListener;
import listener.ButtonViewListener;

public class MenuSelection extends JPanel{
	
	WindowFrame frame;
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Householde Ledger Management Sysytem Menu");
		
		JButton Button1 = new JButton("Spending");
		JButton Button2 = new JButton("Income");
		JButton Button3 = new JButton("Histroy");
		JButton Button4 = new JButton("Delete");
		JButton Button5 = new JButton("Edit");
		JButton Button6 = new JButton("EXIT");
		
		Button1.addActionListener(new ButtonAddListener(frame));
		Button2.addActionListener(new ButtonAddListener(frame));
		Button3.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(label);
		panel2.add(Button1);
		panel2.add(Button2);
		panel2.add(Button3);
		panel2.add(Button4);
		panel2.add(Button5);
		panel2.add(Button6);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
	}

}
