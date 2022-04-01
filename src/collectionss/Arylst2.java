package collectionss;

import java.util.ArrayList;
import java.util.Iterator;

public class Arylst2 {

	public static void main(String[] args) {
		
		ArrayList<String>ac= new ArrayList<>();
		ac.add("Josh");
		ac.add("Siva");
		ac.add("Naresh");
		for (int i = 0; i < ac.size(); i++) {
			System.out.println(ac.get(i)); }
		
		  for(String a:ac) {

	    	 
	    	   System.out.println(a); } 
		  
		  Iterator l= ac.iterator();
	       while(l.hasNext()) {
	    	   System.out.println(l.next());
	       }
	       ac.forEach(k-> System.out.println(k));
	    
	    


	}

}
