package main;
import java.util.Timer;
import java.util.TimerTask;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Functions {
    int[] ids = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
    List<Images> imagenes = new ArrayList<>();

    public void randomizer(String[] x) {
        Collections.shuffle(Arrays.asList(x));
    }

    public List<Images> getImgs() {
        return imagenes;
    }
    public void setImagenes(List<Images> imagenes) {
        this.imagenes = imagenes;
    }

    public void changer(Images i) {

    }




    public Boolean checker(List<Images> imlist, String cover, JLabel lbl) {
        int x = 0;
        List<Images> list2 = new ArrayList<>();
        for (Images imagen : imlist) {
            if (imagen.getStat() == "abierta") {
                x++;
                list2.add(imagen);
            }
        }
        if (x < 2) {
            return true;
        } else if (x == 2) {
            for (Images imag : list2) {
                String url1 = imag.getUrl();
                for (Images imag2 : list2) {
                    if (url1 == imag2.getUrl()) {
                        imag.setStat("encontrada");
                        imag2.setStat("encontrada");
                        win(imlist, lbl);
                    } else {

                        imag.setStat("cerrada");
                        imag2.setStat("cerrada");
                        imag.getButn().setIcon(new ImageIcon(cover));
                        imag2.getButn().setIcon(new ImageIcon(cover));
                        return false;
                    }
                }
            }

        }
        return false;
    }

    public Images btnfinder(List<Images> list, JButton btn) {
        for (Images imagen : list) {
            if (imagen.getButn() == btn) {
                return imagen;
            }
        }

        return null;
    }

    public void painter(Images img) {
        if (img.getStat() == "cerrada") {
            img.getButn().setIcon(new ImageIcon(img.getUrl()));
            img.setStat("abierta");
        }
    }

    public void reset(List<Images> list, JLabel lbl, String cover) {
        lbl.setVisible(false);
        for (Images imagen : list) {
            imagen.setStat("cerrada");
            imagen.getButn().setIcon(new ImageIcon(cover));

        }

    }

    public String[] secArray(String[] urls) {
        String[] secArray = new String[9];
        for (int i = 0; i < 9; i++) {
            secArray[i] = urls[i];
        }
        return secArray;
    }

    public void win(List<Images> list, JLabel lbl) {
        int x = 0;
        for (Images imagen : list) {
            if (imagen.getStat() == "encontrada") {
                x++;
            }
            if (x == 18) {
                lbl.setVisible(true);
            }
        }
    }
}




	
	
