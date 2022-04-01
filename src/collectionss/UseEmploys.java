package collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UseEmploys {

	public static void main(String[] args) {
		Employs e1 = new Employs(167, "Saravana", "Male", 30000);
		Employs e2 = new Employs(167, "Bhavya", "Female", 60000);
		Employs e3 = new Employs(167, "Ram", "Male", 50000);
		Employs e4 = new Employs(167, "Ravi", "Male", 40000);
		ArrayList<Employs> e = new ArrayList<>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		System.out.println(e);

		
		Iterator g = e.iterator();
		while (g.hasNext()) {
			System.out.println(g.next());
		}
		e.forEach(l -> System.out.println(l));
		ArrayList<Employs> tax = new ArrayList<>();

		for (Employs t : e) {
			if ((t.getSalary() >= 20000) && (t.getSalary() < 30000)) {
				System.out.println(t.getSalary());
			}

			else if ((t.getSalary() >= 30000) && (t.getSalary() < 50000)) {
				//System.out.println((t.getSalary() - (t.getSalary() * 5 / 100)));
				t.setSalary((t.getSalary() - (t.getSalary() * 5 / 100)));
			} else if (t.getSalary() >= 50000) {
				//System.out.println((t.getSalary() - (t.getSalary() * 10 / 100)));
				t.setSalary((t.getSalary() - (t.getSalary() * 10 / 100)));
			} else {
				System.out.println("invalid");
			}
		for (int i = 0; i < e.size(); i++) {
			System.out.println(e.get(i));
		}
	}
			List<String> li= e.stream().filter(c-> c.getSalary()>40000).map(c->c.getName()).collect(Collectors.toList());
		System.out.println(li);
}
	
}
