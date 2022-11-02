package EbobEkok;

import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		
		//EKOK = (sayi1*sayi2) / EBOB
		int sayi1, sayi2, i=1,j=1;
		float ebob=0,ekok=0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("1. sayiyi gir: ");
		sayi1 = input.nextInt();
		System.out.print("2. sayiyi gir: ");
		sayi2 = input.nextInt();
		
		if(sayi1<sayi2) {
			while(i<=sayi1) {
				if(sayi1%i==0) {
					if(sayi2%i==0) {
						ebob = i;
					}
				}
				i++;
			}
		}else {
			while(i<=sayi2) {
				if(sayi2%i==0) {
					if(sayi1%i==0) {
						ebob = i;
					}
				}
				i++;
			}
		}
		ekok = (sayi1*sayi2)/ebob;
		System.out.println("Ebob "+(int)ebob + " -- Ekok "+(int)ekok);
		
	}

}
