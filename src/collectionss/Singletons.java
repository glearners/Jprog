package collectionss;

public class Singletons {
	
	private static Singletons ads= null;
	//private String vr;
	private void Singletons() {
		//vr= "you did it";
	}
	public static Singletons getObj() {
		if (ads==null) 
			ads= new Singletons();
			return ads;
	}
	
//	public static void main (String[] args) {
//		Singletons c= new Singletons.getObj();
//		Singletons d= new Singletons.getObj();
//		Singletons e= new Singletons.getObj();
//		System.out.println(c.getObj());
//	System.out.println(d.getObj());
//		System.out.println(e.getObj());
//	}
	
	
	
	

}
