package PratikUsluSayi;

import java.util.Scanner;

public class UsluSayiHesaplama {

	public static void main(String[] args) {
		int n,us, toplam;
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Üssü alınacak sayi");
		n = inp.nextInt();
		System.out.println("Üs olacak sayi");
		us = inp.nextInt();
		
		toplam = n;
		for(int i=1; i<us; i++) {
			toplam*=n;
		}
		System.out.println("Sonuc : "+toplam);
	}

}
