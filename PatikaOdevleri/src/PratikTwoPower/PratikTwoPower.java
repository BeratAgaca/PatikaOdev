package PratikTwoPower;

import java.util.Scanner;

public class PratikTwoPower {
	
	//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini 
	//ekrana yazdıran programı yazıyoruz.
	
	public static void main(String[] args) {
		int n, sayi;
		Scanner inp = new Scanner(System.in);
		
		n = inp.nextInt();
		for(int i=1;i<=n;i*=4) {
			 System.out.println(i);
		}
		System.out.println("--------");
		for(int i=1;i<=n;i*=5) {
			 System.out.println(i);
		}
	}

}
