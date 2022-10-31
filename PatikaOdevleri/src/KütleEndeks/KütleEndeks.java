package KütleEndeks;

import java.util.Scanner;

public class KütleEndeks {

	public static void main(String[] args) {
		float boy=0, kilo=0;
		
		Scanner getData = new Scanner(System.in);
		System.out.print("Kilonuzu giriniz: ");
		kilo = getData.nextFloat();
		System.out.println("Boyunuzu(metre cinsinden) giriniz: ");
		boy = getData.nextFloat();
		System.out.println("Vücut Kütle endeksiniz: "+ kilo/(boy*boy));
		
	}

}
