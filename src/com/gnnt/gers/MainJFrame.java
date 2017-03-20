package com.gnnt.gers;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MainJFrame extends JFrame {

	private JPanel contentPane;
	private JTable infoTable;
	private JPanel dataPanel;
	private JPanel devicesPanel;
	private JScrollPane scrollPane;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		MainJFrame frame = new MainJFrame();
		frame.setUndecorated(false);  
		frame.getGraphicsConfiguration().getDevice()  
                .setFullScreenWindow(frame);
		frame.setVisible(true);
		
		frame.addButton();
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

	/**
	 * Create the frame.
	 */
	public MainJFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel titlePanel = new JPanel();
		titlePanel.setPreferredSize(new Dimension(750, 150));
		contentPane.add(titlePanel, BorderLayout.NORTH);
		
		Image iconImage = Toolkit.getDefaultToolkit().getImage("image/logo.png");
		ImageIcon logoIcon = new ImageIcon(iconImage);
		titlePanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setPreferredSize(new Dimension(96, 96));
		lblNewLabel.setIcon(logoIcon);
		titlePanel.add(lblNewLabel);
		
		devicesPanel = new JPanel();
		devicesPanel.setPreferredSize(new Dimension(200, 400));
		contentPane.add(devicesPanel, BorderLayout.WEST);
		devicesPanel.setLayout(new BorderLayout(0, 0));
		
		
		scrollPane = new JScrollPane();
		scrollPane.setAutoscrolls(true);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		GridLayout gridLayout = new GridLayout(0,1);
//		gridLayout.
		panel.setLayout(gridLayout);
		
		devicesPanel.add(scrollPane,BorderLayout.CENTER);
		
		dataPanel = new JPanel();
		dataPanel.setPreferredSize(new Dimension(550, 400));
		contentPane.add(dataPanel, BorderLayout.CENTER);
		dataPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		dataPanel.add(scrollPane_1, BorderLayout.CENTER);
		
		infoTable = new JTable();
		scrollPane_1.setViewportView(infoTable);
	}
	
	private void addButton() {
		for(int i = 0;i<15;i++) {
			Button button = new Button("btn" + i);
			panel.add(button);
		}
	}
	
}
