package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Game extends JFrame implements ActionListener {
    
	int contadorh,contadorm,contadors,contadorms,dificultad;
    
	Timer gtimer;

    private static final long serialVersionUID = 1L;
    
    int[] ids = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
    
    private JPanel contentPane;
    
    public JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18;
    JButton[] btns = {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18};
    JButton reset,nuevoJuego,regresar,back,mute;
    
    public String[] images = {
            "views/mad/i (1).png", "views/mad/i (2).png", "views/mad/i (3).png", "views/mad/i (4).png", "views/mad/i (5).png", "views/mad/i (6).png",
            "views/mad/i (7).png", "views/mad/i (8).png", "views/mad/i (9).png", "views/mad/i (10).png", "views/mad/i (11).png", "views/mad/i (12).png",
            "views/mad/i (13).png", "views/mad/i (14).png", "views/mad/i (15).png", "views/mad/i (16).png", "views/mad/i (17).png", "views/mad/i (18).png", "views/mad/i (19).png"};
    
    public String[] images2 = {"views/cr/1.png", "views/cr/2.png", "views/cr/3.png", "views/cr/4.png", "views/cr/5.png", "views/cr/6.png", "views/cr/7.png", "views/cr/8.png", "views/cr/9.png",
            "views/cr/10.png", "views/cr/11.png", "views/cr/12.png", "views/cr/13.png", "views/cr/14.png", "views/cr/15.png", "views/cr/16.png", "views/cr/17.png", "views/cr/18.png"};
    
    public String[] images3 = {"views/marv/1.png","views/marv/2.png","views/marv/3.png","views/marv/4.png","views/marv/5.png","views/marv/6.png","views/marv/7.png","views/marv/8.png","views/marv/9.png","views/marv/10.png",
    		"views/marv/11.png","views/marv/12.png","views/marv/13.png","views/marv/14.png","views/marv/15.png","views/marv/16.png","views/marv/17.png","views/marv/18.png"};
    
    public String cover;
    
    public JLabel chrono,background = new JLabel();
    List<Card> imgs = new ArrayList<>();
    Functions f = new Functions();
    
    public JPanel pane;

    public Game() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 928, 658);
        contentPane = new JPanel();
        this.setName("Memorama");
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        f.randomizer(images);


        pane = new JPanel();
        pane.setBounds(10, 45, 912, 531);
        contentPane.add(pane);
        pane.setLayout(null);
        pane.setVisible(false);
        pane.setBackground(new Color(0,0,0,0));
        
        btns[0] = new JButton();
        btns[0].setBounds(0, 0, 140, 165);
        pane.add(btns[0]);
        btns[0].addActionListener(this);
        btns[0].setIcon(new ImageIcon(cover));


        btns[1] = new JButton();
        btns[1].setBounds(150, 0, 140, 165);
        pane.add(btns[1]);
        btns[1].addActionListener(this);
        btns[1].setIcon(new ImageIcon(cover));

        btns[2] = new JButton();
        btns[2].setBounds(299, 0, 140, 165);
        pane.add(btns[2]);
        btns[2].addActionListener(this);
        btns[2].setIcon(new ImageIcon(cover));

        btns[3] = new JButton();
        btns[3].setBounds(449, 0, 140, 165);
        pane.add(btns[3]);
        btns[3].addActionListener(this);
        btns[3].setIcon(new ImageIcon(cover));

        btns[4] = new JButton();
        btns[4].setBounds(599, 0, 140, 165);
        pane.add(btns[4]);
        btns[4].addActionListener(this);
        btns[4].setIcon(new ImageIcon(cover));

        btns[5] = new JButton();
        btns[5].setBounds(749, 0, 140, 165);
        pane.add(btns[5]);
        btns[5].addActionListener(this);
        btns[5].setIcon(new ImageIcon(cover));

        btns[6] = new JButton();
        btns[6].setBounds(0, 177, 140, 165);
        pane.add(btns[6]);
        btns[6].addActionListener(this);
        btns[6].setIcon(new ImageIcon(cover));

        btns[7] = new JButton();
        btns[7].setBounds(150, 177, 140, 165);
        pane.add(btns[7]);
        btns[7].addActionListener(this);
        btns[7].setIcon(new ImageIcon(cover));

        btns[8] = new JButton();
        btns[8].setBounds(300, 177, 140, 165);
        pane.add(btns[8]);
        btns[8].addActionListener(this);
        btns[8].setIcon(new ImageIcon(cover));

        btns[9] = new JButton();
        btns[9].setBounds(449, 177, 140, 165);
        pane.add(btns[9]);
        btns[9].addActionListener(this);
        btns[9].setIcon(new ImageIcon(cover));

        btns[10] = new JButton();
        btns[10].setBounds(599, 177, 140, 165);
        pane.add(btns[10]);
        btns[10].addActionListener(this);
        btns[10].setIcon(new ImageIcon(cover));

        btns[11] = new JButton();
        btns[11].setBounds(749, 177, 140, 165);
        pane.add(btns[11]);
        btns[11].addActionListener(this);
        btns[11].setIcon(new ImageIcon(cover));

        btns[12] = new JButton();
        btns[12].setBounds(0, 353, 140, 165);
        pane.add(btns[12]);
        btns[12].addActionListener(this);
        btns[12].setIcon(new ImageIcon(cover));

        btns[13] = new JButton();
        btns[13].setBounds(150, 353, 140, 165);
        pane.add(btns[13]);
        btns[13].addActionListener(this);
        btns[13].setIcon(new ImageIcon(cover));

        btns[14] = new JButton();
        btns[14].setBounds(300, 353, 140, 165);
        pane.add(btns[14]);
        btns[14].addActionListener(this);
        btns[14].setIcon(new ImageIcon(cover));

        btns[15] = new JButton();
        btns[15].setBounds(449, 353, 140, 165);
        pane.add(btns[15]);
        btns[15].addActionListener(this);
        btns[15].setIcon(new ImageIcon(cover));

        btns[16] = new JButton();
        btns[16].setBounds(599, 353, 140, 165);
        pane.add(btns[16]);
        btns[16].addActionListener(this);
        btns[16].setIcon(new ImageIcon(cover));

        btns[17] = new JButton();
        btns[17].setBounds(749, 353, 140, 165);
        pane.add(btns[17]);
        btns[17].addActionListener(this);
        btns[17].setIcon(new ImageIcon(cover));


       

        
        chrono = new JLabel("");
        chrono.setBounds(10, 6, 209, 28);
        contentPane.add(chrono);
        
        regresar = new JButton();
        regresar.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
        regresar.setText("Return");
        regresar.setBounds(750, 587, 152, 30);
        contentPane.add(regresar);
        
        nuevoJuego = new JButton();
        nuevoJuego.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 11));
        nuevoJuego.setText("New Game");
        nuevoJuego.setBounds(588, 587, 152, 30);
        contentPane.add(nuevoJuego);
        
        background = new JLabel("");
        background.setBounds(0, 6, 922, 623);
        contentPane.add(background);
        chrono.setForeground(Color.white);
        
       

    }


    @Override
    public void actionPerformed(ActionEvent e) {

       if (e.getSource() == btns[0]) {
            if (f.checker(imgs, cover,gtimer,contadorm,contadors,contadorms)) {
                f.painter(f.btnfinder(imgs, btns[0]));
            }
        } else if (e.getSource() == btns[1]) {
            if (f.checker(imgs, cover,gtimer,contadorm,contadors,contadorms)) {
                f.painter(f.btnfinder(imgs, btns[1]));

            }
        } else if (e.getSource() == btns[2]) {
            if (f.checker(imgs, cover,gtimer,contadorm,contadors,contadorms)) {
                f.painter(f.btnfinder(imgs, btns[2]));

            }
        } else if (e.getSource() == btns[3]) {
            if (f.checker(imgs, cover,gtimer,contadorm,contadors,contadorms)) {
                f.painter(f.btnfinder(imgs, btns[3]));

            }
        } else if (e.getSource() == btns[4]) {
            if (f.checker(imgs, cover,gtimer,contadorm,contadors,contadorms)) {
                f.painter(f.btnfinder(imgs, btns[4]));

            }
        } else if (e.getSource() == btns[5]) {
            if (f.checker(imgs, cover,gtimer,contadorm,contadors,contadorms)) {
                f.painter(f.btnfinder(imgs, btns[5]));
            }
            
        } else if (e.getSource() == btns[6]) {
            if (f.checker(imgs, cover,gtimer,contadorm,contadors,contadorms)) {
                f.painter(f.btnfinder(imgs, btns[6]));
            }
        } else if (e.getSource() == btns[7]) {
            if (f.checker(imgs, cover,gtimer,contadorm,contadors,contadorms)) {
                f.painter(f.btnfinder(imgs, btns[7]));

            }
        } else if (e.getSource() == btns[8]) {
            if (f.checker(imgs, cover,gtimer,contadorm,contadors,contadorms)) {
                f.painter(f.btnfinder(imgs, btns[8]));

            }
        } else if (e.getSource() == btns[9]) {
            if (f.checker(imgs, cover,gtimer,contadorm,contadors,contadorms)) {
                f.painter(f.btnfinder(imgs, btns[9]));

            }
        } else if (e.getSource() == btns[10]) {
            if (f.checker(imgs, cover,gtimer,contadorm,contadors,contadorms)) {
                f.painter(f.btnfinder(imgs, btns[10]));

            }
        } else if (e.getSource() == btns[11]) {
            if (f.checker(imgs, cover,gtimer,contadorm,contadors,contadorms)) {
                f.painter(f.btnfinder(imgs, btns[11]));

            }
        } else if (e.getSource() == btns[12]) {
            if (f.checker(imgs, cover,gtimer,contadorm,contadors,contadorms)) {
                f.painter(f.btnfinder(imgs, btns[12]));

            }
        } else if (e.getSource() == btns[13]) {
            if (f.checker(imgs, cover,gtimer,contadorm,contadors,contadorms)) {
                f.painter(f.btnfinder(imgs, btns[13]));

            }
        } else if (e.getSource() == btns[14]) {
            if (f.checker(imgs, cover,gtimer,contadorm,contadors,contadorms)) {
                f.painter(f.btnfinder(imgs, btns[14]));

            }
        } else if (e.getSource() == btns[15]) {
            if (f.checker(imgs, cover,gtimer,contadorm,contadors,contadorms)) {
                f.painter(f.btnfinder(imgs, btns[15]));

            }
        } else if (e.getSource() == btns[16]) {
            if (f.checker(imgs, cover,gtimer,contadorm,contadors,contadorms)) {
                f.painter(f.btnfinder(imgs, btns[16]));

            }
        } else if (e.getSource() == btns[17]) {
            if (f.checker(imgs, cover,gtimer,contadorm,contadors,contadorms)) {
                f.painter(f.btnfinder(imgs, btns[17]));

            }

        }


    }

    public void start(String[] str, JButton[] btns, JPanel pane) {
        pane.setVisible(true);
        f.btnenable(btns);
        contadorm = 0;
        contadors = 0;
        contadorh = 0;
        imgs.clear();
        Collections.shuffle(Arrays.asList(str));
        Collections.shuffle(Arrays.asList(btns));
        for (int i = 0; i < 9; i++) {
            Card img = new Card(ids[i], str[i], "cerrada", btns[i]);
            Card img2 = new Card(ids[i + 9], f.secArray(str)[i], "cerrada", btns[i + 9]);
            imgs.add(img);
            imgs.add(img2);
        }
        Collections.shuffle(imgs);
        f.reset(imgs,cover);


        
        if(gtimer == null) {

            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    String stconts = String.valueOf(contadors);
                    String stcontm = String.valueOf(contadorm);
                    String stconth = String.valueOf(contadorh);
                    String stcontms = String.valueOf(contadorms);
                    chrono.setText(stconth+":"+stcontm+":"+stconts);
                    contadorms++;
                    if(contadorms > 99) {
                    	contadorms=0;
                    	contadors++;
                    	
                    	if(contadors > 60) {
                    		contadors=0;
                    		contadorm++;
                    		if(contadorm > 60) {
                    			contadorm = 0;
                    			contadorh++;
                    		}
                    	}
                    }
                    switch(dificultad) {
                    case 1:
                    	if(contadorm == 3 && contadorms == 1) {
                    		f.btndisable(btns);
                    		gtimer.cancel();
                    		JOptionPane.showMessageDialog(null,"PERDISTE!!");
                    	
                    	}
                    	break;
                    case 2:
                    	if(contadorm == 1 && contadorms == 1) {
                    		f.btndisable(btns);
                    		gtimer.cancel();
                    		JOptionPane.showMessageDialog(null,"PERDISTE!!");
                        	}
                    	break;
                    case 3:
                    	if(contadors == 30 && contadorms == 1) {
                    		f.btndisable(btns);
                    		gtimer.cancel();
                    		JOptionPane.showMessageDialog(null,"PERDISTE!!");
                        	}
                    	break;
                    default:
                    	if(contadorh == 24 && contadorms == 1) {
                    		f.btndisable(btns);
                        	gtimer.cancel();
                        	}
                    	break;
                    }
                 }
            };

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(timerTask,0,10);
        gtimer = timer;
        }else{
            gtimer.cancel();
            gtimer.purge();


            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    String stconts = String.valueOf(contadors);
                    String stcontm = String.valueOf(contadorm);
                    String stconth = String.valueOf(contadorh);
                    String stcontms = String.valueOf(contadorms);
                    chrono.setText(stconth+":"+stcontm+":"+stconts);
                    contadorms++;
                    if(contadorms > 100) {
                    	contadorms=0;
                    	contadors++;
                    		if(contadors > 60) {
                    			contadors=0;
                    			contadorm++;
                    			if(contadorm > 60) {
                    				contadorm = 0;
                    				contadorh++;
                    			}
                    		}
                    	}
                    
                    switch(dificultad) {
                    case 1:
                    	if(contadorm == 3 && contadorms == 1) {
                    		f.btndisable(btns);
                    		gtimer.cancel();
                    		JOptionPane.showMessageDialog(null,"PERDISTE!!");
                    	}
                    	break;
                    case 2:
                    	if(contadorm == 1 && contadorms == 1) {
                    		f.btndisable(btns);
                    		gtimer.cancel();
                    		JOptionPane.showMessageDialog(null,"PERDISTE!!");
                        	}
                    	break;
                    case 3:
                    	if(contadors == 30 && contadorms == 1) {
                    		f.btndisable(btns);
                    		gtimer.cancel();
                    		JOptionPane.showMessageDialog(null,"PERDISTE!!");
                        	}
                    	break;
                    default:
                    	if(contadorh == 24 && contadorms == 1) {
                    		f.btndisable(btns);
                        	gtimer.cancel();

                        	}
                    	break;
                    }
                }
            };

            Timer timer = new Timer();
            timer.scheduleAtFixedRate(timerTask,0,10);
            gtimer = timer;

        }
        
        
    }
}

