package main;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Font;

public class Menu extends JFrame implements ActionListener {
    window w = new window();
    Functions f = new Functions();
    private JPanel contentPane;
    List<Images> listaIm = new ArrayList<>();

    JButton start = new JButton();


    private ButtonGroup select = new ButtonGroup();
    int choice;

    public Menu() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 250, 150);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        start = new JButton("Start");
        start.setEnabled(false);
        start.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
        start.addActionListener(this);
        start.setBounds(72, 11, 89, 23);
        contentPane.add(start);


        JRadioButton mad = new JRadioButton("Real Madrid");
        mad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                choice = 1;
                start.setEnabled(true);
            }
        });
        mad.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
        mad.setBounds(21, 52, 109, 23);
        contentPane.add(mad);

        JRadioButton cr = new JRadioButton("Clash Royale");
        cr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                choice = 2;
                start.setEnabled(true);
            }
        });
        cr.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
        cr.setBounds(129, 52, 109, 23);
        contentPane.add(cr);
        setResizable(false);

        select.add(cr);
        select.add(mad);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            if (choice == 1) {
                f.randomizer(w.images);
                w.start(w.images, w.btns, w.lblGanaste, w.pane);

            } else if (choice == 2) {
                f.randomizer(w.images2);
                w.start(w.images2, w.btns, w.lblGanaste, w.pane);
                w.cover = "cr/logo.png";
            }
            Collections.shuffle(f.imagenes);
            setListaIm(f.imagenes);
            w.reset.setEnabled(true);
            w.setVisible(true);

        }
    }


    public List<Images> getListaIm() {
        return listaIm;
    }


    public void setListaIm(List<Images> listaIm) {
        this.listaIm = listaIm;
    }


}
