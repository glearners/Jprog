package collectionss;

import java.util.ArrayList;
import java.util.Iterator;

public class Forrarraylist {

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		li.add(225);
		li.add(12);
		li.add(30);
		li.add(45);

		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));

		}
       for(Integer s:li) {
    	   if (s>30) {
    	   System.out.println(s);
       }
       }
       
       Iterator itr= li.iterator();
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
       }
       li.forEach(k-> System.out.println(k));
       
       
	}

}
