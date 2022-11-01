package PratikBurclar;

import java.util.Scanner;

public class PratikBurclar {
	 
	public static void main(String[] args) {
		int month,day;
		String burç="";
		boolean isError = false;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Doğduğunuz ay : " );
		month=input.nextInt();
		
		System.out.println("Doğduğunuz gün : ");
		day = input.nextInt();
		if((day>0 && day<31) && (month>0 && month<13)) { 
			if((month==3 && day>=21) || (month==4 && day<=20)) {
				System.out.println("Burcunuz Koç");
			}
			if((month==4 && day>=21) || (month==5 && day<=21)) {
				System.out.println("Burcunuz Boğa");
			}
			if((month==5 && day>=22) || (month==6 && day<=22)) {
				System.out.println("Burcunuz İkizler");
			}
			if((month==6 && day>=23) || (month==7 && day<=22)) {
				System.out.println("Burcunuz Yengeç");
			}
			if((month==7 && day>=23) || (month==8 && day<=22)) {
				System.out.println("Burcunuz Aslan");
			}
			if((month==8 && day>=23) || (month==9 && day<=22)) {
				System.out.println("Burcunuz Başak");
			}
			if((month==9 && day>=23) || (month==10 && day<=22)) {
				System.out.println("Burcunuz Terazi");
			}
			if((month==10 && day>=23) || (month==11 && day<=21)) {
				System.out.println("Burcunuz Akrep");
			}
			if((month==11 && day>=22) || (month==12 && day<=21)) {
				System.out.println("Burcunuz Yay");
			}
			if((month==12 && day>=22) || (month==1 && day<=21)) {
				System.out.println("Burcunuz Oğlak");
			}
			if((month==1 && day>=22) || (month==2 && day<=19)) {
				System.out.println("Burcunuz Kova");
			} 
			if((month==2 && day>=20) || (month==3 && day<=20)) {
				System.out.println("Burcunuz Balık");
			} 
		}
		else {
			System.out.println("Hatalı tarih girdiniz");
		}
		
		
	}

}
