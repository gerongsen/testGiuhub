package com.gnnt.gers;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class testSwing extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		testSwing  ts = new testSwing();
		ts.setUndecorated(false);  
		ts.getGraphicsConfiguration().getDevice()  
                .setFullScreenWindow(ts);
		ts.setVisible(true);

	}
	
	public testSwing() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JButton button = new JButton("1");
		panel.add(button);
	}

	

}
