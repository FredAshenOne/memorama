package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Functions {
int[] ids = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
ArrayList<Images> imgs;
String[] im2;

	

public String[] randomizer(String[] x) {
		Collections.shuffle(Arrays.asList(x));
		return x;
	}	
	
	public String[] sndImages(String[] s) {
		for(int i=0;i < 9;i++) {
			im2[i] = s[i];
		}
		return randomizer(im2);
		}
	
	public void changer(boolean[] b,String[] s,JButton btn,int xb,int xi) {
		b[xb] = (b[xb])?false:true;
		String image; 
		 image = (b[xb])?s[xi]:"views/mad.png";
		 btn.setIcon(new ImageIcon(image));
	}
	
	public void start(String[] str,String[] str2,boolean[] swi) {
		
		for(int i=0;i < 18;i++) {
			if(i < 9) {
			imgs.add(new Images(ids[0],str[i],swi[i],"cerrada"));
			}else {
				imgs.add(new Images(ids[0],str2[i-9],swi[i],"cerrada"));
			}
		}
		
		System.out.println(imgs.get(2).getUrl());

	}
	
	


}




