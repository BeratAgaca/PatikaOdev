package pratik;

import java.util.Scanner;
//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e 
//tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
public class Main {

	public static void main(String[] args) {
		int sayi,toplam=0,counter=0;
		Scanner inp = new Scanner(System.in);

		
		System.out.println("Bir sayi giriniz : ");
		sayi = inp.nextInt();
		for(int i=0; i<=sayi; i++) {
			if(i%4==0 && i%3==0) {
				counter++;
				toplam+=i;
			}
		}
		System.out.println(sayi+" ya kadar olan sayılardan 3 ve 4 e tam bölünen sayıların ortalaması : "+toplam/counter);
	}

}
