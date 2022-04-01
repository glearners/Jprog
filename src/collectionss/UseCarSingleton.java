package collectionss;

public class UseCarSingleton {

	public static void main(String[] args) {
	     CarSingleton c1= CarSingleton.instances();
	     CarSingleton c2= CarSingleton.instances();
System.out.println(c2.brand);
System.out.println(c1.brand);
	}

}
