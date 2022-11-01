package ArtikYil;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int artikYil;
		
		System.out.print("Yıl Giriniz : ");
		artikYil = inp.nextInt();
		
		if(artikYil%4==0) {
			if(artikYil%400==0) {
				System.out.println(artikYil+" bir artık yıldır !");
			}else if(artikYil%100!=0){
				System.out.println(artikYil+" bir artık yıldır !");
			}else {
				System.out.println(artikYil+" bir artık yıldır değildir !");
			}
		}
		else {
			System.out.println(artikYil+" bir artık yıldır değildir !");
		}
	}

}
