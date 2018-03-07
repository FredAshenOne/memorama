package main;

public class Images {
	
	private int id;
	private String url,stat;
	private boolean swi;
	
	public Images(int id,String url,boolean swi, String stat) {
		this.id = id;
		this.url = url;
		this.swi = swi;
		this.stat = stat;
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

	public boolean isSwi() {
		return swi;
	}

	public void setSwi(boolean swi) {
		this.swi = swi;
	}
	
	

}
