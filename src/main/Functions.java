package main;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Functions {
	Integer[] pos = {0,1,2,3,4,5,6,7,8};
	
	public void imageR(String[] x) {
		Collections.shuffle(Arrays.asList(x));
	}
	public void numR(Integer[] x) {
		
		List<Integer> valuesList = Arrays.asList(x);
		Collections.shuffle(valuesList);

	}
	
	
	public void sndImages(String[] x,JButton btn1,JButton btn2,JButton btn3,JButton btn4,JButton btn5,JButton btn6,JButton btn7,JButton btn8,JButton btn9) {

		
		System.out.println(Arrays.toString(pos));
		numR(pos);
		System.out.println(pos[0]); 	
		
		btn1.setIcon(new ImageIcon(x[pos[0]]));
		btn2.setIcon(new ImageIcon(x[pos[1]]));
		btn3.setIcon(new ImageIcon(x[pos[2]]));
		btn4.setIcon(new ImageIcon(x[pos[3]]));
		btn5.setIcon(new ImageIcon(x[pos[4]]));
		btn6.setIcon(new ImageIcon(x[pos[5]]));	
		btn7.setIcon(new ImageIcon(x[pos[6]]));
		btn8.setIcon(new ImageIcon(x[pos[7]]));
		btn9.setIcon(new ImageIcon(x[pos[8]]));
		}
	}


