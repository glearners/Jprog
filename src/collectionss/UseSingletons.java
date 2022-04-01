package collectionss;

public class UseSingletons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Singletons c= new Singletons();
			Singletons d= new Singletons();
			Singletons e= new Singletons();
			
			System.out.println(c.getObj());
			System.out.println(d.getObj());
			System.out.println(e.getObj());
		
		
		
	}

}
