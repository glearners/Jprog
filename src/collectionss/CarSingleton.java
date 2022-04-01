package collectionss;

public class CarSingleton {
	String brand;
	private CarSingleton (String brand) {
		this.brand= brand;
		
	}
	private  static CarSingleton c=null;
	public static CarSingleton instances() {
		if(c==null){
			c= new CarSingleton("TATA");
		}
		return c;
	}

}
