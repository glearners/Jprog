package collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseWildAnimal {

	public static void main(String[] args) {
		WildAnimal wa1 = new WildAnimal("Tiger", "Cat", 450, "Male");
		WildAnimal wa2 = new WildAnimal("Lion", "Cat", 750, "Female");
		WildAnimal wa3 = new WildAnimal("Hipo", "Reptile", 1500, "Male");

		ArrayList<WildAnimal> w = new ArrayList<>();
		w.add(wa1);
		w.add(wa2);
		w.add(wa3);
		System.out.println(w);

//	 for (int i=0;i<w.size();i++) {
//		 System.out.println(w.get(i));
//	 }
//	 Iterator its= w.iterator(); 
//	 while(its.hasNext()) {
//		 System.out.println(its.next());
//	 }
//	 w.forEach(x-> System.out.println(x));
//	 
//	 ArrayList<WildAnimal> male= new ArrayList<>();
//	 for(WildAnimal h : w) {
//		 if(h.getGender().equals("Male")) {
//			 male.add(h);
//		 }
//		 System.out.println(male);
//	 }

		List<WildAnimal> wmale = w.stream().filter(da -> da.getGender().equalsIgnoreCase("male"))
				.collect(Collectors.toList());
		System.out.println(wmale);
		
		
		Long wmale1 = w.stream().filter(da -> da.getGender().equalsIgnoreCase("female")).count();
		System.out.println(wmale1);
		
		
		List<String> gender = w.stream().map(b -> b.getGender()).collect(Collectors.toList());
		System.out.println(gender);

	}

}
