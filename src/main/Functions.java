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
	
	public void start(String[] str,JButton[] btns) {
		for(int i=0;i < 9;i++) {
			Images img = new Images(ids[i],str[i],"cerrada",btns[i]);
			Images img2 = new Images(ids[i+9],str[i],"cerrada",btns[i+9]);
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
	
	public Boolean checker(List<Images> imlist){
		int x = 0;
		for(Images imagen:imlist) {
			if(imagen.getStat()=="abierta"){
				x++;
			}
		}
		if(x < 2) {
			return true;
		}else {
			return false;
		}
	}
	
	public void btnfinder(List<Images> list,int x) {
		for(Images imagen:list) {
			if(imagen.getId() == x) {
				imagen.getButn().setIcon((new ImageIcon(imagen.getUrl())));
			}
		}
		
		
	}
	
	public void setbackImag(Images im) {
		im.getButn().setIcon(new ImageIcon("views/mad.png"));
	}
	
	public JButton listobject(List<Images> list,Object object) {
		for(Images imagen:list) {
			if(object == imagen.getButn()) {
				return imagen.getButn();
			}
		}
		
		return null;
	}
	
	public void painter(Images img) {
		
		if(img.getStat()=="cerrada") {
			img.getButn().setIcon(new ImageIcon(img.getUrl()));
			img.setStat("abierta");
		}	
	}
	
	public void getImg(List<Images> imlist,int x) {
		for(Images imagen:imlist) {
			if(imagen.getId() == x) {
				System.out.println("si checa");
			}
		}
	}
	
	
	
}
	
	
