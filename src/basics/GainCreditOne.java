package basics;

public class GainCreditOne {
	
	int[][] a=new int[3][3];
	
	public void print() {
		for (int i = 1; i <= a.length; i++) {
			for (int j = 1; j <= a.length; j++) {
				for (int k = j;k <= j; k++) {
					
				/*
				 * if (i==2) { System.out.print(3+j+" "); } else if (i==3) {
				 * System.out.print(6+j+" "); } else { System.out.print(j+" "); }
				 */
				System.out.print(k+" ");
			}
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		GainCreditOne g=new GainCreditOne();
		g.print();
	}

}
