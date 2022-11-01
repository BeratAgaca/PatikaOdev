package BasitHesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		int firstNum, secondNum, select;
		Scanner input = new Scanner(System.in);
		
		System.out.println("İlk sayıyı giriniz : ");
		firstNum = input.nextInt();
		System.out.println("İkinci sayıyı giriniz : ");
		secondNum = input.nextInt();
		System.out.println("1-Toplama için\n2-Çıkarma için\n3-Çarpma için\n4-Bölme için");
		System.out.println("Seçiminiz nedir? :");
		select=input.nextInt();
		switch(select) {
		case(1):
			System.out.println("Sonucunuz:"+(firstNum+secondNum));
			break;
		case(2):
			System.out.println("Sonucunuz:"+(firstNum-secondNum));
			break;
		case(3):
			System.out.println("Sonucunuz:"+(firstNum*secondNum));
			break;
		case(4):
			if(secondNum!=0) {
				System.out.println("Sonucunuz:"+(firstNum/secondNum));
				break;
			}
			
		default:
			System.out.println("Yanlış seçim yaptınız");
		}
	}
	

}
