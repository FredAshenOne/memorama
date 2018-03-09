package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class window extends JFrame implements ActionListener {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18;
	JButton[] btns = {btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18};
	JButton reset,start = new JButton();
	private String[] images = {
			"views/i (1).png","views/i (2).png","views/i (3).png","views/i (4).png","views/i (5).png","views/i (6).png",
			"views/i (7).png","views/i (8).png","views/i (9).png","views/i (10).png","views/i (11).png","views/i (12).png",
			"views/i (13).png","views/i (14).png","views/i (15).png","views/i (16).png","views/i (17).png","views/i (18).png","views/i (19).png"};	
	
	List<Images> imgs= new ArrayList<Images>();
	Images imagen;
	
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
		
		btns[0] = new JButton();
		btns[0].setBounds(10, 101, 140, 165);
		contentPane.add(btns[0]);
		btns[0].addActionListener(this);
		btns[0].setIcon(new ImageIcon("views/mad.png"));
		
		
		btns[1] = new JButton();
		btns[1].setBounds(160, 101, 140, 165);
		contentPane.add(btns[1]);
		btns[1].addActionListener(this);
		btns[1].setIcon(new ImageIcon("views/mad.png"));
		
		btns[2] = new JButton();
		btns[2].setBounds(309, 101, 140, 165);
		contentPane.add(btns[2]);
		btns[2].addActionListener(this);
		btns[2].setIcon(new ImageIcon("views/mad.png"));

		btns[3] = new JButton();
		btns[3].setBounds(459, 101, 140, 165);
		contentPane.add(btns[3]);
		btns[3].addActionListener(this);
		btns[3].setIcon(new ImageIcon("views/mad.png"));

		btns[4] = new JButton();
		btns[4].setBounds(609, 101, 140, 165);
		contentPane.add(btns[4]);
		btns[4].addActionListener(this);
		btns[4].setIcon(new ImageIcon("views/mad.png"));

		btns[5] = new JButton();
		btns[5].setBounds(759, 101, 140, 165);
		contentPane.add(btns[5]);
		btns[5].addActionListener(this);
		btns[5].setIcon(new ImageIcon("views/mad.png"));

		btns[6] = new JButton();
		btns[6].setBounds(10, 277, 140, 165);
		contentPane.add(btns[6]);
		btns[6].addActionListener(this);
		btns[6].setIcon(new ImageIcon("views/mad.png"));

		btns[7] = new JButton();
		btns[7].setBounds(160, 277, 140, 165);
		contentPane.add(btns[7]);
		btns[7].addActionListener(this);
		btns[7].setIcon(new ImageIcon("views/mad.png"));

		btns[8] = new JButton();
		btns[8].setBounds(310, 277, 140, 165);
		contentPane.add(btns[8]);
		btns[8].addActionListener(this);
		btns[8].setIcon(new ImageIcon("views/mad.png"));

		btns[9] = new JButton();
		btns[9].setBounds(459, 277, 140, 165);
		contentPane.add(btns[9]);
		btns[9].addActionListener(this);
		btns[9].setIcon(new ImageIcon("views/mad.png"));

		btns[10] = new JButton();
		btns[10].setBounds(609, 277, 140, 165);
		contentPane.add(btns[10]);
		btns[10].addActionListener(this);
		btns[10].setIcon(new ImageIcon("views/mad.png"));

		btns[11] = new JButton();
		btns[11].setBounds(759, 277, 140, 165);
		contentPane.add(btns[11]);
		btns[11].addActionListener(this);
		btns[11].setIcon(new ImageIcon("views/mad.png"));

		btns[12] = new JButton();
		btns[12].setBounds(10, 453, 140, 165);
		contentPane.add(btns[12]);
		btns[12].addActionListener(this);
		btns[12].setIcon(new ImageIcon("views/mad.png"));

		btns[13] = new JButton();
		btns[13].setBounds(160, 453, 140, 165);
		contentPane.add(btns[13]);
		btns[13].addActionListener(this);
		btns[13].setIcon(new ImageIcon("views/mad.png"));

		btns[14] = new JButton();
		btns[14].setBounds(310, 453, 140, 165);
		contentPane.add(btns[14]);
		btns[14].addActionListener(this);
		btns[14].setIcon(new ImageIcon("views/mad.png"));

		btns[15] = new JButton();
		btns[15].setBounds(459, 453, 140, 165);
		contentPane.add(btns[15]);
		btns[15].addActionListener(this);
		btns[15].setIcon(new ImageIcon("views/mad.png"));

		btns[16] = new JButton();
		btns[16].setBounds(609, 453, 140, 165);
		contentPane.add(btns[16]);
		btns[16].addActionListener(this);
		btns[16].setIcon(new ImageIcon("views/mad.png"));

		btns[17] = new JButton();
		btns[17].setBounds(759, 453, 140, 165);
		contentPane.add(btns[17]);
		btns[17].addActionListener(this);
		btns[17].setIcon(new ImageIcon("views/mad.png"));
		
		reset = new JButton();
		reset.setText("Reset");
		reset.setBounds(332, 39, 89, 23);
		reset.setEnabled(false);
		contentPane.add(reset);
		reset.addActionListener(this);
		
		start.setText("Start");
		start.setBounds(470, 39, 89, 23);
		contentPane.add(start);
		start.addActionListener(this);
		
		
		
	}
		

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==start) {
			
			f.randomizer(images);
			f.start(images,btns);
			reset.setEnabled(true);
			
		}else if(e.getSource()==reset){
		}else if(e.getSource() == btns[0]) {
			if(f.checker(imgs)) {
				System.out.println(a);
				

			}
		}else if(e.getSource() == btns[1]) {
			System.out.println("lo 1!!");
		}else if(e.getSource() == btns[2]) {
			System.out.println("lo 2!!");
		}else if(e.getSource() == btns[3]) {
			System.out.println("lo 3!!");
		}else if(e.getSource() == btns[4]) {
			System.out.println("lo 4!!");
		}else if(e.getSource() == btns[5]) {
			System.out.println("lo 5!!");
		}
		
	}
}

