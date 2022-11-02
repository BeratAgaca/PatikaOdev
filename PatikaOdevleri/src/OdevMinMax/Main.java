package OdevMinMax;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük 
		//sayıları bulan ve bu sayıları ekrana yazan programı yazın.
		
		int i, min=0, max=0,temp=0;
		Scanner inp = new Scanner(System.in);
		System.out.print("Kaç tane sayı gireceksiniz: ");
		i = inp.nextInt();
		
		for(int j=0; j<i; j++) {
			System.out.print((j+1)+". Sayıyı giriniz: ");
			temp = inp.nextInt();
			if(j==0) {
				max = temp;
				min = temp;
			}else {
				if(min<=temp && temp<=max) {
					continue;
				}else {
					if(temp<min) {
						min = temp;
					}else if(temp>max) {
						max = temp;
					}
				}
			}
		}
		System.out.println("En büyük sayı: "+max);
		System.out.println("En küçük sayı: "+min);
	}

}
