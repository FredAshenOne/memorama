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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Functions {
    int[] ids = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
    List<Card> imagenes = new ArrayList<>();

    public void randomizer(String[] x) {
        Collections.shuffle(Arrays.asList(x));
    }

    public List<Card> getImgs() {
        return imagenes;
    }
    public void setImagenes(List<Card> imagenes) {
        this.imagenes = imagenes;
    }

    public void changer(Card i) {

    }




    public Boolean checker(List<Card> imlist, String cover,Timer timer,int contadorm,int contadors,int contadorms) {
        
        List<Card> list2 = new ArrayList<>();
        
        for (Card imagen : imlist) {
            if (imagen.getStat() == "abierta") {
                
                list2.add(imagen);
            }
        }
        if (list2.size() < 2) {
            return true;
        } else if (list2.size() == 2) {
            for (Card imag : list2) {
                String url1 = imag.getUrl();
                for (Card imag2 : list2) {
                    if (url1 == imag2.getUrl()) {
                        imag.setStat("encontrada");
                        imag2.setStat("encontrada");
                       
                        
                        
                    } else {

                        imag.setStat("cerrada");
                        imag2.setStat("cerrada");
                        imag.getButn().setIcon(new ImageIcon(cover));
                        imag2.getButn().setIcon(new ImageIcon(cover));
                        return false;
                    }
                }
            }
            win(imlist,timer,contadorm,contadors,contadorms);

        }
        return false;
    }

    public Card btnfinder(List<Card> list, JButton btn) {
        for (Card imagen : list) {
            if (imagen.getButn() == btn) {
                return imagen;
            }
        }

        return null;
    }

    public void painter(Card img) {
        if (img.getStat() == "cerrada") {
            img.getButn().setIcon(new ImageIcon(img.getUrl()));
            img.setStat("abierta");
        }
    }

    public void reset(List<Card> list, String cover) {
        for (Card imagen : list) {
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

    public void win(List<Card> list,Timer timer,int contadorm,int contadors,int contadorms) {
        int x = 0;
        for (Card imagen : list) {
            if (imagen.getStat() == "encontrada") {
                x++;
            }
            if (x == 18) {
                timer.cancel();
                JOptionPane.showMessageDialog(null,"Terminaste!! \n Tu tiempo fue: "+contadorm+":"+contadors+":"+contadorms);
                
            }
        }
    }
    
    public void btndisable(JButton[] btns) {
    	for(JButton btn :Arrays.asList(btns)) {
    		btn.setEnabled(false);
    	}
    }
    	
    	public void btnenable(JButton[] btns) {
        	for(JButton btn :Arrays.asList(btns)) {
        		btn.setEnabled(true);
        	}
    }


}




	
	
