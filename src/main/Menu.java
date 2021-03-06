package main;


import javax.sound.sampled.AudioSystem;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.sound.sampled.*;

import java.io.*;

public class Menu extends JFrame implements ActionListener {
    File file;
    Clip clip;

	private static final long serialVersionUID = 1L;
	Game w = new Game();
    Functions f = new Functions();
    private JPanel contentPane;
    List<Card> listaIm = new ArrayList<>();

    JButton start = new JButton();

    private ButtonGroup select = new ButtonGroup();
    int choice;
    private JButton cr,mad,marv = new JButton();

    public Menu() {
    	
    	ButtonGroup botones = new ButtonGroup();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 391, 185);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setOpaque(true);
        contentPane.setBackground(Color.white);

        mad = new JButton();
        mad.setBorder(null);
        mad.setBounds(21, 37, 109, 100);
        mad.setIcon(new ImageIcon("views/mad/madlogo.png"));
        contentPane.add(mad);
        mad.addActionListener(this);
        mad.setBackground(null);

        cr = new JButton();
        cr.setBounds(140, 37, 109, 100);
        contentPane.add(cr);
        cr.setIcon(new ImageIcon("views/cr/logo2.png"));
        setResizable(false);
        cr.addActionListener(this);
        cr.setBackground(null);
        cr.setBorder(null);
        
        select.add(cr);
        select.add(mad);
        
        marv = new JButton();
        marv.setBounds(259, 37, 109, 100);
        contentPane.add(marv);
        marv.addActionListener(this);
        marv.setIcon(new ImageIcon("views/marv/logo.png"));
        marv.setBorder(null);
        
        JRadioButton easy = new JRadioButton("Facil");
        easy.setBounds(21, 7, 57, 23);
        contentPane.add(easy);
        easy.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
            	w.dificultad = 1;
        	}
        });
        
        JRadioButton medium = new JRadioButton("Medio");
        medium.setBounds(91, 7, 76, 23);
        contentPane.add(medium);
        medium.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
            	w.dificultad = 2;

        	}
        });
        
        JRadioButton hard = new JRadioButton("Dificil");
        hard.setBounds(169, 7, 63, 23);
        contentPane.add(hard);
        hard.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
            	w.dificultad = 3;
        	}
        });
        
        JRadioButton noTime = new JRadioButton("Sin Limite");
        noTime.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
            	w.dificultad = 4;
        	}
        });
        noTime.setBounds(234, 7, 109, 23);
        contentPane.add(noTime);
        w.regresar.addActionListener(this);
        w.nuevoJuego.addActionListener(this);
        
        
        botones.add(easy);
        botones.add(medium);
        botones.add(hard);
        botones.add(noTime);
        
        botones.clearSelection();
        noTime.setSelected(true);
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mad) {
           
                w.cover = "views/mad/mad.png";
                f.randomizer(w.images);
                choice = 1;

                w.start(w.images, w.btns, w.pane);
                Collections.shuffle(f.imagenes);
                w.setVisible(true);
                w.background.setIcon(new ImageIcon("views/mad/championswp.png"));
                music("views/music/champions.wav");
                this.setVisible(false);

            } else if (e.getSource() == cr) {
                w.cover = "views/cr/logo.png";
                choice = 2;
                f.randomizer(w.images2);
                w.background.setIcon(new ImageIcon("views/cr/crwp.png"));
                w.start(w.images2, w.btns, w.pane);
                Collections.shuffle(f.imagenes);
                w.setVisible(true);
                music("views/music/crmenutheme.wav");
                

                this.setVisible(false);
            
            

        }else if (e.getSource() == marv) {
            w.cover = "views/marv/marvcov.png";
            w.background.setIcon(new ImageIcon("views/marv/marvwp.png"));
            f.randomizer(w.images3);
            choice = 3;
            w.start(w.images3, w.btns, w.pane);
            Collections.shuffle(f.imagenes);
            w.setVisible(true);

            music("views/music/marvel.wav");
            this.setVisible(false);
        
        

    }else if(e.getSource() == w.regresar) {
        	w.setVisible(false);
        	this.setVisible(true);
        	w.gtimer.cancel();
        	w.gtimer.purge();
        	clip.stop();
        }else if(e.getSource()==w.nuevoJuego) {
        	if (choice == 1) {
                w.cover = "views/mad/mad.png";
                f.randomizer(w.images);
                w.start(w.images, w.btns, w.pane);


            } else if (choice == 2) {
                w.cover = "views/cr/logo.png";
                f.randomizer(w.images2);
                w.start(w.images2, w.btns, w.pane);

            }else if (choice == 3) {
            	 w.cover = "views/marv/marvcov.png";
                 f.randomizer(w.images3);
                 w.start(w.images3, w.btns, w.pane);

            }
            Collections.shuffle(f.imagenes);
        }else if(e.getSource()== w.back) {
        	clip.stop();
        }
        
        
        }
    
    	public void music(String url) {
    		try{
    		    file = new File(url);
    		    clip = AudioSystem.getClip();
    		    clip.open(AudioSystem.getAudioInputStream(file));
    		    clip.start();
    		    clip.loop(clip.LOOP_CONTINUOUSLY);

            }catch(Exception e){
    		    System.err.println(e.getMessage());
            }
    	}
    }


