package TekSayiToplam;

import java.util.Scanner;

public class TekSayiToplam {
	/*
	 * Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden 
	 * ve girilen değerlerden çift ve 4'ün 
	 * katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
	 */
	public static void main(String[] args) {
		int sayi,toplam=0;
		Scanner inp = new Scanner(System.in);
		while(true) {
			sayi = inp.nextInt();
			if(sayi%2==0) {
				toplam+=sayi;
			}else {
				break;
			}
		}
		System.out.println("Toplam : "+toplam);
	}

}
