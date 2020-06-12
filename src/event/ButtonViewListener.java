package event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.HistoryViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {
	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getHistoryviewer());
		frame.revalidate();
		frame.repaint();
	}

}
