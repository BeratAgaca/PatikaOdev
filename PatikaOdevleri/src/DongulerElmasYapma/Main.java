package DongulerElmasYapma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
		Scanner inp = new Scanner(System.in);
		System.out.println("Bir Sayı Giriniz :");
        int n = inp.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n; i >= 0 ; i--) {
            for (int j = (n - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i + 1); k >= 1 ; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
	}

}
