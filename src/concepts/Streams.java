package concepts;

import java.util.Arrays;
//import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		List<Person> persons=Arrays.asList(
				new Person(29,"John"),
				new Person(31,"Joe"),
				new Person(28, "Chris"),
				new Person(42, "Steve"),
				new Person(35, "Mike"));
		
		//persons.stream().filter(p->p.getAge()>30).map(p->p.getName()+" is "+p.getAge()).sorted().forEach(System.out::print);
		
		//persons.stream().reduce((p1,p2)->p1.getAge()>p2.getAge()?p1:p2).map(p->p.getName()+" is "+p.getAge()).ifPresent(System.out::print);
		
		//System.out.println(persons);
		
		//persons.stream().sorted(Comparator.comparingInt(Person::getAge)).map(p->p.toString()).forEach(System.out::println);
		
		/*
		 * int agesum =persons.stream().filter(p->p.getAge()>30).map(p->p.getAge()).reduce((a,b)->a+b).get();
		 *  System.out.println(agesum);
		 */
		
		Map<Integer, String> peeps=persons.stream().filter(x->x.getAge()>=30).collect(Collectors.toMap(x->x.getAge(), x->x.getName()));
				peeps.forEach((k, v)->{
					System.out.println(v+" is "+k+" old ");
				});
		
		
	}

}
