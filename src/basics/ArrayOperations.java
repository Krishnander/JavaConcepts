package basics;

public class ArrayOperations {
	
	public static void insert(int b[],int position) {
		if (b[position]!=0) {
			b[position]=8;
			System.out.println("Array after insertion is :");
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]);
			}
		}
		else {
			System.out.println("Insertion failed");
		}
	}
	
	public static void search(int c[],int searchvalue) {
		System.out.println("Element found at");
		for (int i = 0; i < c.length; i++) {
			if (c[i]==searchvalue) {
				System.out.println(i);
			}
		}
	}
	
	public static void delete(int d[],int value) {
		for (int i = 0; i < d.length; i++) {
			if (d[i]==value) {
				for (int j = i; j < d.length-1; j++) {
					d[j]=d[j+1];
				}
				break;
			}
		}
		System.out.println("The new elements are :");
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
			
		}
		//Arrays.stream(d).filter(i->d[i]==value).map(i->d[i]).toArray();
	}

	public static void main(String[] args) {
		int a[]=new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i]=i;
		}
		
		insert(a,3);
		search(a, 8);
		delete(a, 8);
		
	}

}
