package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class window extends JFrame implements ActionListener {


    private static final long serialVersionUID = 1L;
    int[] ids = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
    private JPanel contentPane;
    public JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18;
    JButton[] btns = {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18};
    JButton reset,nuevoJuego,regresar;
    public String[] images = {
            "views/i (1).png", "views/i (2).png", "views/i (3).png", "views/i (4).png", "views/i (5).png", "views/i (6).png",
            "views/i (7).png", "views/i (8).png", "views/i (9).png", "views/i (10).png", "views/i (11).png", "views/i (12).png",
            "views/i (13).png", "views/i (14).png", "views/i (15).png", "views/i (16).png", "views/i (17).png", "views/i (18).png", "views/i (19).png"};
    public String[] images2 = {"cr/1.png", "cr/2.png", "cr/3.png", "cr/4.png", "cr/5.png", "cr/6.png", "cr/7.png", "cr/8.png", "cr/9.png",
            "cr/10.png", "cr/11.png", "cr/12.png", "cr/13.png", "cr/14.png", "cr/15.png", "cr/16.png", "cr/17.png", "cr/18.png"};
    public String[] images3 = {"marv/1.png","marv/2.png","marv/3.png","marv/4.png","marv/5.png","marv/6.png","marv/7.png","marv/8.png","marv/9.png","marv/10.png",
    		"marv/11.png","marv/12.png","marv/13.png","marv/14.png","marv/15.png","marv/16.png","marv/17.png","marv/18.png"};
    public String cover;
    public JLabel lblGanaste = new JLabel();
    List<Images> imgs = new ArrayList<>();
    Functions f = new Functions();
    public JPanel pane;
    public window() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 928, 658);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        f.randomizer(images);


        pane = new JPanel();
        pane.setBounds(10, 45, 892, 531);
        contentPane.add(pane);
        pane.setLayout(null);
        pane.setVisible(false);

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

        reset = new JButton();
        reset.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
        reset.setText("Reset");
        reset.setBounds(813, 11, 89, 23);
        reset.setEnabled(false);
        contentPane.add(reset);
        reset.addActionListener(this);


        lblGanaste = new JLabel("GANASTE!!");
        lblGanaste.setFont(new Font("Yu Gothic UI", Font.ITALIC, 14));
        lblGanaste.setHorizontalAlignment(SwingConstants.CENTER);
        lblGanaste.setBounds(333, 6, 224, 28);
        lblGanaste.setVisible(false);
        contentPane.add(lblGanaste);
        
        regresar = new JButton("Return");
        regresar.setFont(new Font("Yu Gothic Light", Font.PLAIN, 12));
        regresar.setBounds(813, 587, 89, 23);
        contentPane.add(regresar);
        regresar.addActionListener(this);
        
        nuevoJuego = new JButton("New Game");
        nuevoJuego.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 9));
        nuevoJuego.setBounds(714, 587, 89, 23);
        contentPane.add(nuevoJuego);
        nuevoJuego.addActionListener(this);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == reset) {
            f.reset(imgs, lblGanaste, cover);

        } else if (e.getSource() == btns[0]) {
            if (f.checker(imgs, cover, lblGanaste)) {
                f.painter(f.btnfinder(imgs, btns[0]));
            }
        } else if (e.getSource() == btns[1]) {
            if (f.checker(imgs, cover, lblGanaste)) {
                f.painter(f.btnfinder(imgs, btns[1]));

            }
        } else if (e.getSource() == btns[2]) {
            if (f.checker(imgs, cover, lblGanaste)) {
                f.painter(f.btnfinder(imgs, btns[2]));

            }
        } else if (e.getSource() == btns[3]) {
            if (f.checker(imgs, cover, lblGanaste)) {
                f.painter(f.btnfinder(imgs, btns[3]));

            }
        } else if (e.getSource() == btns[4]) {
            if (f.checker(imgs, cover, lblGanaste)) {
                f.painter(f.btnfinder(imgs, btns[4]));

            }
        } else if (e.getSource() == btns[5]) {
            if (f.checker(imgs, cover, lblGanaste)) {
                f.painter(f.btnfinder(imgs, btns[5]));
            }
        } else if (e.getSource() == btns[6]) {
            if (f.checker(imgs, cover, lblGanaste)) {
                f.painter(f.btnfinder(imgs, btns[6]));
                f.win(imgs, lblGanaste);
            }
        } else if (e.getSource() == btns[7]) {
            if (f.checker(imgs, cover, lblGanaste)) {
                f.painter(f.btnfinder(imgs, btns[7]));

            }
        } else if (e.getSource() == btns[8]) {
            if (f.checker(imgs, cover, lblGanaste)) {
                f.painter(f.btnfinder(imgs, btns[8]));

            }
        } else if (e.getSource() == btns[9]) {
            if (f.checker(imgs, cover, lblGanaste)) {
                f.painter(f.btnfinder(imgs, btns[9]));

            }
        } else if (e.getSource() == btns[10]) {
            if (f.checker(imgs, cover, lblGanaste)) {
                f.painter(f.btnfinder(imgs, btns[10]));

            }
        } else if (e.getSource() == btns[11]) {
            if (f.checker(imgs, cover, lblGanaste)) {
                f.painter(f.btnfinder(imgs, btns[11]));

            }
        } else if (e.getSource() == btns[12]) {
            if (f.checker(imgs, cover, lblGanaste)) {
                f.painter(f.btnfinder(imgs, btns[12]));

            }
        } else if (e.getSource() == btns[13]) {
            if (f.checker(imgs, cover, lblGanaste)) {
                f.painter(f.btnfinder(imgs, btns[13]));

            }
        } else if (e.getSource() == btns[14]) {
            if (f.checker(imgs, cover, lblGanaste)) {
                f.painter(f.btnfinder(imgs, btns[14]));

            }
        } else if (e.getSource() == btns[15]) {
            if (f.checker(imgs, cover, lblGanaste)) {
                f.painter(f.btnfinder(imgs, btns[15]));

            }
        } else if (e.getSource() == btns[16]) {
            if (f.checker(imgs, cover, lblGanaste)) {
                f.painter(f.btnfinder(imgs, btns[16]));

            }
        } else if (e.getSource() == btns[17]) {
            if (f.checker(imgs, cover, lblGanaste)) {
                f.painter(f.btnfinder(imgs, btns[17]));

            }

        }
    }

    public void start(String[] str, JButton[] btns, JLabel lbl, JPanel pane) {
        lbl.setVisible(false);
        pane.setVisible(true);
        imgs.clear();
        Collections.shuffle(Arrays.asList(str));
        Collections.shuffle(Arrays.asList(btns));
        for (int i = 0; i < 9; i++) {
            Images img = new Images(ids[i], str[i], "cerrada", btns[i]);
            Images img2 = new Images(ids[i + 9], f.secArray(str)[i], "cerrada", btns[i + 9]);
            imgs.add(img);
            imgs.add(img2);
        }


        Collections.shuffle(imgs);
        f.reset(imgs,lblGanaste,cover);


    }
}

