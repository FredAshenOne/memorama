package main;

import javax.swing.JButton;

public class Card {
	
	private int id;
	private String url,stat;
	private JButton butn;
	
	public Card(int id,String url, String stat,JButton butn) {
		this.id = id;
		this.butn = butn;
		this.url = url;
		this.stat = stat;

	}
	

	public JButton getButn() {
		return butn;
	}

	public void setButn(JButton butn) {
		this.butn = butn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

}
