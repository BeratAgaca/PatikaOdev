package UcakBileti;

import java.util.Scanner;

public class UcakBileti { 
	public static void main(String[] args) {
		 int mesafe, yas, yolculukTipi;
		 double tutar,indirim;
		 
		 double yasliIndirimOran=0.3,gencIndirimOran=0.1;
		 double cocukIndirimOran=0.5,gidisDonusIndirimOran=0.2; 
		 
		 Scanner input = new Scanner(System.in);
		 System.out.print("Mesafeyi km türünden giriniz : ");
		 mesafe = input.nextInt();
		 System.out.print("Yaşınızı giriniz : ");
		 yas = input.nextInt();
		 System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
		 yolculukTipi = input.nextInt();
		 
		 if(mesafe>0 && yas>0 && (yolculukTipi==1 || yolculukTipi==2)) {
			 tutar = mesafe*0.10;
			 if(yas<12) {
				 indirim = tutar*cocukIndirimOran;
				 tutar-=indirim;
			 }else if(yas>=12 && yas<=24) {
				 indirim = tutar*gencIndirimOran;
				 tutar-=indirim;
			 }else if(yas>65) {
				 indirim = tutar*yasliIndirimOran;
				 tutar-=indirim;
			 }
			 if(yolculukTipi==2) {
				 indirim = tutar*gidisDonusIndirimOran;
				 tutar-=indirim;
				 tutar *= 2;
			 }
			 System.out.println("Toplam Tutar = "+(int)tutar+" TL");
		 }
		 else {
			 System.out.println("Hatalı Veri Girdiniz !");
		 }
	}

}
