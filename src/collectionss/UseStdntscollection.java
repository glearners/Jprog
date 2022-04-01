package collectionss;

import java.util.ArrayList;
import java.util.Iterator;

public class UseStdntscollection {

	public static void main(String[] args) {
         Stdntscollection s1= new  Stdntscollection (12,"Blaa","11th",1996);
         Stdntscollection s2= new  Stdntscollection (13,"Biju","11th",1997);
 		
         Stdntscollection s3= new  Stdntscollection (14,"Beema","11th",1996);
         Stdntscollection s4= new  Stdntscollection (15,"Bilal","11th",1997);
         
         ArrayList<Stdntscollection> students= new ArrayList<>();
         students.add(s1);
         students.add(s2);
         students.add(s3);
         students.add(s4);
         System.out.println(students);
         for (int i = 0; i < students.size(); i++) {
 			System.out.println(students.get(i));
 		}
         for(Stdntscollection a:students) {

	    	 
	    	   System.out.println(a); } 
		  
		  Iterator st= students.iterator();
	       while(st.hasNext()) {
	    	   System.out.println(st.next());
	       }
	       students.forEach(k-> System.out.println(k));
	    

 		

	}

}
