package manage;

public class dealer {
	int dealerid;
	String name;
	public dealer(int dealerid, String name) {
		super();
		this.dealerid = dealerid;
		this.name = name;
	}
	public int getDealerid() {
		return dealerid;
	}
	public void setDealerid(int dealerid) {
		this.dealerid = dealerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
