package main;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Font;

public class Menu extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	window w = new window();
    Functions f = new Functions();
    private JPanel contentPane;
    List<Images> listaIm = new ArrayList<>();

    JButton start = new JButton();


    private ButtonGroup select = new ButtonGroup();
    int choice;
    private JButton cr,mad = new JButton();

    public Menu() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 270, 185);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        start = new JButton("Start");
        start.setEnabled(false);
        start.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
        start.addActionListener(this);
        start.setBounds(81, 11, 89, 23);
        contentPane.add(start);


        JButton mad = new JButton();
        mad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                choice = 1;
                start.setEnabled(true);
            }
        });
        mad.setBounds(22, 41, 109, 100);
        mad.setIcon(new ImageIcon("views/madlogo.png"));
        contentPane.add(mad);

        JButton cr = new JButton();
        cr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                choice = 2;
                start.setEnabled(true);
            }
        });
        cr.setBounds(129, 41, 109, 100);
        contentPane.add(cr);
        cr.setIcon(new ImageIcon("cr/logo2.png"));
        setResizable(false);

        select.add(cr);
        select.add(mad);
        
        w.regresar.addActionListener(this);
        w.nuevoJuego.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            if (choice == 1) {
                w.cover = "views/mad.png";
                f.randomizer(w.images);
                w.start(w.images, w.btns, w.lblGanaste, w.pane);

            } else if (choice == 2) {
                w.cover = "cr/logo.png";
                f.randomizer(w.images2);
                w.start(w.images2, w.btns, w.lblGanaste, w.pane);

            }
            Collections.shuffle(f.imagenes);
            w.reset.setEnabled(true);
            w.setVisible(true);
            this.setVisible(false);
            
            

        }else if(e.getSource() == w.regresar) {
        	w.setVisible(false);
        	this.setVisible(true);
        }else if(e.getSource()==w.nuevoJuego) {
        	if (choice == 1) {
                w.cover = "views/mad.png";
                f.randomizer(w.images);
                w.start(w.images, w.btns, w.lblGanaste, w.pane);

            } else if (choice == 2) {
                w.cover = "cr/logo.png";
                f.randomizer(w.images2);
                w.start(w.images2, w.btns, w.lblGanaste, w.pane);

            }
            Collections.shuffle(f.imagenes);
        }
        }
    }


