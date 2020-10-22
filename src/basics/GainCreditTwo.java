package basics;

import java.util.Scanner;

public class GainCreditTwo {

	public int magicNumber(int input) {
		int count = 0, square = 0, sum = 0;
		for (int i = 1; i <= input; i++) {
			square = i * i;
			sum = sum(square);

			if (sum != 89 && sum != 1) {

				while (sum != 89 && sum != 1) {
					sum = sum(sum);
				}

				count++;
			}

		}
		return count;
	}

	public int sum(int square) {
		int p = 0, q = 0, r = 0, s = 0;
		
		r = square % 10;
		p = square / 10;
		while (p > 0) {
			q = p / 10;
			s = p % 10;
			p=q/10;
		}

		return (p * p) + (q * q) + (r * r) + (s * s);
		
	}

	public static void main(String[] args) {
		int input = 0;
		System.out.println("Enter the nummber ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		sc.close();
		GainCreditTwo g = new GainCreditTwo();
		System.out.println("The answer is " + g.magicNumber(input));
	}

}
