package collectionss;

public class Stdntscollection {
	private int id;
	private String name;
	private String clas;
	private int dob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public Stdntscollection(int id, String name, String clas, int dob) {
		super();
		this.id = id;
		this.name = name;
		this.clas = clas;
		this.dob = dob;
	}

	public String toString() {
		return "Stdntscollection [id=" + id + ", name=" + name + ", clas=" + clas + ", dob=" + dob + "]";
	}

}
