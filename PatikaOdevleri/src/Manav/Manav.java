package Manav;

import java.util.Scanner;

public class Manav {

	public static void main(String[] args) {
		double armut=2.14;
		double elma=3.67;
		double domates= 1.11;
		double muz= 0.95;
		double patlican=5.00;
		float total=0, kilo=0;
		Scanner getData = new Scanner(System.in);
		
		System.out.println("armut Kaç Kilo ?");
		kilo= getData.nextFloat();
		total += kilo*armut;
		System.out.println("elma Kaç Kilo ?");
		kilo= getData.nextFloat();
		total += kilo*elma;
		System.out.println("domates Kaç Kilo ?");
		kilo= getData.nextFloat();
		total += kilo*domates;
		System.out.println("muz Kaç Kilo ?");
		kilo= getData.nextFloat();
		total += kilo*muz;
		System.out.println("patlican Kaç Kilo ?");
		kilo= getData.nextFloat();
		total += kilo*patlican;
		
		System.out.println("Toplam Tutar : "+total+ " TL");
		

	}

}
