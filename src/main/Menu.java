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


	private static final long serialVersionUID = 1L;
	window w = new window();
    Functions f = new Functions();
    private JPanel contentPane;
    List<Images> listaIm = new ArrayList<>();

    JButton start = new JButton();

    private ButtonGroup select = new ButtonGroup();
    int choice;
    private JButton cr,mad,marv = new JButton();

    public Menu() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 394, 167);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

      


        mad = new JButton();
        mad.setBounds(20, 11, 109, 100);
        mad.setIcon(new ImageIcon("views/madlogo.png"));
        contentPane.add(mad);
        mad.addActionListener(this);

        cr = new JButton();
        cr.setBounds(134, 11, 109, 100);
        contentPane.add(cr);
        cr.setIcon(new ImageIcon("cr/logo2.png"));
        setResizable(false);
        cr.addActionListener(this);

        select.add(cr);
        select.add(mad);
        
        marv = new JButton();
        marv.setBounds(249, 11, 109, 100);
        contentPane.add(marv);
        marv.addActionListener(this);
        marv.setIcon(new ImageIcon("marv/logo.png"));
        w.regresar.addActionListener(this);
        w.nuevoJuego.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mad) {
           
                w.cover = "views/mad.png";
                f.randomizer(w.images);
                choice = 1;
                w.start(w.images, w.btns, w.lblGanaste, w.pane);
                Collections.shuffle(f.imagenes);
                w.reset.setEnabled(true);
                w.setVisible(true);
                this.setVisible(false);

            } else if (e.getSource() == cr) {
                w.cover = "cr/logo.png";
                choice = 2;
                f.randomizer(w.images2);
                w.start(w.images2, w.btns, w.lblGanaste, w.pane);
                Collections.shuffle(f.imagenes);
                w.reset.setEnabled(true);
                w.setVisible(true);
                this.setVisible(false);
            
            

        }else if (e.getSource() == marv) {
            w.cover = "marv/logo.png";
            f.randomizer(w.images3);
            choice = 3;
            w.start(w.images3, w.btns, w.lblGanaste, w.pane);
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

            }else if (choice == 3) {
            	 w.cover = "marv/logo.png";
                 f.randomizer(w.images3);
                 w.start(w.images3, w.btns, w.lblGanaste, w.pane);

            }
            Collections.shuffle(f.imagenes);
        }
        }
    }


