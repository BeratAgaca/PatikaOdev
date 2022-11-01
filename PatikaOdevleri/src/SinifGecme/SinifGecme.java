package SinifGecme;

import java.util.Scanner;

public class SinifGecme {

	public static void main(String[] args) {
		double avg;
		int dersSayisi=5;
		int mat,fizik,turkce,kimya,muzik;
		Scanner input = new Scanner(System.in);
		
		System.out.println("mat notunuz : ");
		mat = input.nextInt();
		if(mat<0 || mat>100) {
			mat=0;
			dersSayisi--;
		}
		
		System.out.println("fizik notunuz : ");
		fizik = input.nextInt(); 
		System.out.println("turkce notunuz : ");
		turkce = input.nextInt();
		if(turkce<0 || turkce>100) {
			turkce=0;
			dersSayisi--;
		}
		System.out.println("kimya notunuz : ");
		kimya = input.nextInt();
		if(kimya<0 || kimya>100) {
			kimya=0;
			dersSayisi--;
		}
		System.out.println("muzik notunuz : ");
		muzik = input.nextInt();
		if(muzik<0 || muzik>100) {
			muzik=0;
			dersSayisi--;
		}
		
		if(dersSayisi!=0) {
			avg = (mat+kimya+muzik+turkce+fizik)/dersSayisi;
		}
		else {
			avg =0;
		}
		if(avg<=55) {
			System.out.println("Sınıfta kaldınız");
		}
		else {
			System.out.println("Ortalamanız : "+avg);
		}
		
		
	}

}
