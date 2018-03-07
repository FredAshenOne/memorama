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
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,reset,start = new JButton();
	private String[] images = {
			"views/i (1).png","views/i (2).png","views/i (3).png","views/i (4).png","views/i (5).png","views/i (6).png",
			"views/i (7).png","views/i (8).png","views/i (9).png","views/i (10).png","views/i (11).png","views/i (12).png",
			"views/i (13).png","views/i (14).png","views/i (15).png","views/i (16).png","views/i (17).png","views/i (18).png","views/i (19).png",};
	private boolean[] change = {false,false,false,false,false,
			false,false,false,false,false,
			false,false,false,false,false,
			false,false,false};
	String[] im2 = new String[9];
	
	Functions f = new Functions();

	public window() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 658);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		f.randomizer(images);
		
		
		btn1.setBounds(10, 101, 140, 165);
		contentPane.add(btn1);
		btn1.addActionListener(this);
		btn1.setIcon(new ImageIcon("views/mad.png"));
		
		
		btn2.setBounds(160, 101, 140, 165);
		contentPane.add(btn2);
		btn2.addActionListener(this);
		btn2.setIcon(new ImageIcon("views/mad.png"));
		
		btn3.setBounds(309, 101, 140, 165);
		contentPane.add(btn3);
		btn3.addActionListener(this);
		btn3.setIcon(new ImageIcon("views/mad.png"));

		btn4.setBounds(459, 101, 140, 165);
		contentPane.add(btn4);
		btn4.addActionListener(this);
		btn4.setIcon(new ImageIcon("views/mad.png"));

		btn5.setBounds(609, 101, 140, 165);
		contentPane.add(btn5);
		btn5.addActionListener(this);
		btn5.setIcon(new ImageIcon("views/mad.png"));

		btn6.setBounds(759, 101, 140, 165);
		contentPane.add(btn6);
		btn6.addActionListener(this);
		btn6.setIcon(new ImageIcon("views/mad.png"));

		btn7.setBounds(10, 277, 140, 165);
		contentPane.add(btn7);
		btn7.addActionListener(this);
		btn7.setIcon(new ImageIcon("views/mad.png"));

		btn8.setBounds(160, 277, 140, 165);
		contentPane.add(btn8);
		btn8.addActionListener(this);
		btn8.setIcon(new ImageIcon("views/mad.png"));

		btn9.setBounds(310, 277, 140, 165);
		contentPane.add(btn9);
		btn9.addActionListener(this);
		btn9.setIcon(new ImageIcon("views/mad.png"));

		btn10.setBounds(459, 277, 140, 165);
		contentPane.add(btn10);
		btn10.addActionListener(this);
		btn10.setIcon(new ImageIcon("views/mad.png"));

		btn11.setBounds(609, 277, 140, 165);
		contentPane.add(btn11);
		btn11.addActionListener(this);
		btn11.setIcon(new ImageIcon("views/mad.png"));

		btn12.setBounds(759, 277, 140, 165);
		contentPane.add(btn12);
		btn12.addActionListener(this);
		btn12.setIcon(new ImageIcon("views/mad.png"));

		btn13.setBounds(10, 453, 140, 165);
		contentPane.add(btn13);
		btn13.addActionListener(this);
		btn13.setIcon(new ImageIcon("views/mad.png"));

		btn14.setBounds(160, 453, 140, 165);
		contentPane.add(btn14);
		btn14.addActionListener(this);
		btn14.setIcon(new ImageIcon("views/mad.png"));

		btn15.setBounds(310, 453, 140, 165);
		contentPane.add(btn15);
		btn15.addActionListener(this);
		btn15.setIcon(new ImageIcon("views/mad.png"));

		btn16.setBounds(459, 453, 140, 165);
		contentPane.add(btn16);
		btn16.addActionListener(this);
		btn16.setIcon(new ImageIcon("views/mad.png"));

		btn17.setBounds(609, 453, 140, 165);
		contentPane.add(btn17);
		btn17.addActionListener(this);
		btn17.setIcon(new ImageIcon("views/mad.png"));

		btn18.setBounds(759, 453, 140, 165);
		contentPane.add(btn18);
		btn18.addActionListener(this);
		btn18.setIcon(new ImageIcon("views/mad.png"));
		
		reset.setText("Reset");
		reset.setBounds(332, 39, 89, 23);
		contentPane.add(reset);
		
		start.setText("Start");
		start.setBounds(470, 39, 89, 23);
		contentPane.add(start);
		start.addActionListener(this);
		
		
		
	}
		

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==start) {
			f.start(images, f.sndImages(images),change);
		}

	}
}
