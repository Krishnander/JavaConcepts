package basics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayLst {

	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("gk");
		l.add("ok");
		l.forEach(p->System.out.println(p));
		l.removeIf(g->g.startsWith("g"));
		for(String s:l) {
			System.out.println(s);
		}
		
		System.out.println("Iterator");
		l.add("pk");
		Iterator<String> lItr=l.iterator();
		while(lItr.hasNext()) {
			String s=lItr.next();
			System.out.println(s);
		}
		System.out.println("using foreachrem and lambda");
		lItr=l.iterator();
		lItr.forEachRemaining(p->System.out.println(p));
		
		System.out.println("sort using lambdacompare");
		l.add("ak");
		l.sort((a,b)->a.compareTo(b));
		l.forEach(p->System.out.println(p));
		
		System.out.println("sort by comparator");
		l.add("dk");
		l.sort(Comparator.naturalOrder());
		System.out.println(l);
	}
}
