package BasamakToplam;

import java.util.Scanner;

public class BasamakToplam {

	public static void main(String[] args) {
		// Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
		Scanner inp = new Scanner(System.in);
		int toplam=0,sayiInt, basamakSayisi, degisken;
		String sayi;
		System.out.print("Bir sayi giriniz : ");
		
		sayi = inp.nextLine();
		basamakSayisi = sayi.length();
		sayiInt = Integer.parseInt(sayi);
		
		for(int i=0; i<basamakSayisi; i++) {
			degisken=sayiInt%10;
			sayiInt -= degisken;
			sayiInt/= 10;
			toplam+= degisken;
		}
		System.out.println("toplam : "+ toplam);
		
		
	}

}
