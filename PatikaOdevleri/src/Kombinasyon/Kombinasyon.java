package Kombinasyon;

import java.util.Scanner;

public class Kombinasyon {
	public static void main(String[] args) {
		
		//C(n,r) = n! / (r! * (n-r)!)
		int n,r,kombinasyon, x=1,y=1;
		Scanner inp = new Scanner(System.in);
		n = inp.nextInt();
		r = inp.nextInt();
		
		if(n>=r) {
			for(int i=n; i>r; i--) {
				x *= i;
			}
			for(int j=(n-r); j>=1; j--) {
				y *= j;
			} 
			kombinasyon= x/ y;
			System.out.println(n + " ve "+ r + "'ın Kombinasyonu : "+ kombinasyon);
		}
	}	

}
