package collectionss;

public class WildAnimal {
	private String name;
	private String family;
	private int weight;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender= gender;
	}
	public WildAnimal(String name, String family, int weight, String gender) {
		super();
		this.name = name;
		this.family = family;
		this.weight = weight;
		this.gender= gender;
	}
	@Override
	public String toString() {
		return "WildAnimal [name=" + name + ", family=" + family + ", weight=" + weight + ", gender=" + gender + "]";
	}


}
