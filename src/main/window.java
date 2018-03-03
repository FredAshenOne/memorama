package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class window extends JFrame implements ActionListener {

	private JPanel contentPane;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19 = new JButton();
	private String[] images = {
			"i (1).png","i (2).png","i (3).png","i (4).png","i (5).png","i (6).png",
			"i (7).png","i (8).png","i (9).png","i (10).png","i (11).png","i (12).png",
			"i (13).png","i (14).png","i (15).png","i (16).png","i (17).png","i (18).png","i (19).png",};
	
	Functions f = new Functions();

	public window() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 571);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		f.imageR(images);
		
		
		btn1 = new JButton();
		btn1.setBounds(10, 11, 140, 165);
		contentPane.add(btn1);
		btn1.addActionListener(this);
		btn1.setIcon(new ImageIcon(images[0]));
		
		btn2 = new JButton();
		btn2.setBounds(160, 11, 140, 165);
		contentPane.add(btn2);
		btn2.addActionListener(this);
		btn2.setIcon(new ImageIcon(images[1]));

		btn3 = new JButton();
		btn3.setBounds(310, 11, 140, 165);
		contentPane.add(btn3);
		btn3.addActionListener(this);
		btn3.setIcon(new ImageIcon(images[2]));

		btn4 = new JButton();
		btn4.setBounds(459, 11, 140, 165);
		contentPane.add(btn4);
		btn4.addActionListener(this);
		btn4.setIcon(new ImageIcon(images[3]));

		btn5 = new JButton();
		btn5.setBounds(609, 11, 140, 165);
		contentPane.add(btn5);
		btn5.addActionListener(this);
		btn5.setIcon(new ImageIcon(images[4]));

		btn6 = new JButton();
		btn6.setBounds(759, 11, 140, 165);
		contentPane.add(btn6);
		btn6.addActionListener(this);
		btn6.setIcon(new ImageIcon(images[5]));

		btn7 = new JButton();
		btn7.setBounds(10, 187, 140, 165);
		contentPane.add(btn7);
		btn7.addActionListener(this);
		btn7.setIcon(new ImageIcon(images[6]));

		btn8 = new JButton();
		btn8.setBounds(160, 187, 140, 165);
		contentPane.add(btn8);
		btn8.addActionListener(this);
		btn8.setIcon(new ImageIcon(images[7]));

		btn9 = new JButton();
		btn9.setBounds(310, 187, 140, 165);
		contentPane.add(btn9);
		btn9.addActionListener(this);
		btn9.setIcon(new ImageIcon(images[8]));

		btn10 = new JButton();
		btn10.setBounds(459, 187, 140, 165);
		contentPane.add(btn10);
		btn10.addActionListener(this);

		btn11 = new JButton();
		btn11.setBounds(609, 187, 140, 165);
		contentPane.add(btn11);
		btn11.addActionListener(this);

		btn12 = new JButton();
		btn12.setBounds(759, 187, 140, 165);
		contentPane.add(btn12);
		btn12.addActionListener(this);

		btn13 = new JButton();
		btn13.setBounds(10, 363, 140, 165);
		contentPane.add(btn13);
		btn13.addActionListener(this);

		btn14 = new JButton();
		btn14.setBounds(160, 363, 140, 165);
		contentPane.add(btn14);
		btn14.addActionListener(this);

		btn15 = new JButton();
		btn15.setBounds(310, 363, 140, 165);
		contentPane.add(btn15);
		btn15.addActionListener(this);

		btn16 = new JButton();
		btn16.setBounds(459, 363, 140, 165);
		contentPane.add(btn16);
		btn16.addActionListener(this);

		btn17 = new JButton();
		btn17.setBounds(609, 363, 140, 165);
		contentPane.add(btn17);
		btn17.addActionListener(this);

		btn18 = new JButton();
		btn18.setBounds(759, 363, 140, 165);
		contentPane.add(btn18);
		btn18.addActionListener(this);
		
		f.sndImages(images, btn10, btn11, btn12, btn13, btn14, btn15, btn16,btn17,btn18);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
//		if(e.getSource()==btn1) {
//			##btn8.setIcon(new ImageIcon(images[0]));
//		}
//		

	}
}
