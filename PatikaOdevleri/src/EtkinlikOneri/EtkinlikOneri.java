package EtkinlikOneri;

import java.util.Scanner;

public class EtkinlikOneri {

	public static void main(String[] args) {
		int heat;
		Scanner input = new Scanner(System.in);
		System.out.println("Sıcaklık giriniz:");
		heat = input.nextInt();
		
		if(heat<5) {
			System.out.println("Kayak yapabilirsiniz");
		}else if(heat>=5 && heat<15) {
			System.out.println("Sinemaya gidebilirsiniz");
		}else if(heat>=15 && heat<25) {
			System.out.println("Piknik yapabilirsiniz");
		}
		else if(heat>=25) {
			System.out.println("Yüzebilirsiniz");
		}
	}

}
