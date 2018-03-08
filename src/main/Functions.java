package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Functions {
int[] ids = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
List<Images> imagenes = new ArrayList<Images>();


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
	
	public void start(String[] str,boolean[] swi) {
		for(int i=0;i < 9;i++) {
			Images img = new Images(ids[i],str[i],swi[i],"cerrada");
			Images img2 = new Images(ids[i+9],str[i],swi[i],"cerrada");
			imagenes.add(img);
			imagenes.add(img2);						
		}
		Collections.shuffle(imagenes);		
	}
	
	public void restart(JButton[] btns) {
		for(int i = 0; i < btns.length;i++) {
			
			btns[i].setIcon(new ImageIcon("views/mad.png"));
		}
	}
	public void painter(int x,List<Images> imgs,JButton btn) {
	if(!imgs.get(x).isSwi() && imgs.get(x).getStat()=="cerrada") {
		imgs.get(x).setSwi(true);
	btn.setIcon(new ImageIcon(imgs.get(x).getUrl()));
	imgs.get(x).setStat("abierta");
	}else {
		btn.setIcon(new ImageIcon("views/mad.png"));
		imgs.get(x).setStat("cerrada");
		imgs.get(x).setSwi(false);
		}
	}
	
}




