package KullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		String username, password, newPassword, enterEscape;
		int select=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kullanıcı adınızı giriniz:");
		username=input.nextLine();
		System.out.println("Sifrenizi giriniz:");
		password=input.nextLine();
		
		if(username.equals("Berat") && password.equals("Agaca")) {
			System.out.println("Giriş başarılı");
		}
		else if(username.equals("Berat") && !password.equals("Agaca")){
			System.out.println("Şifrenizi sıfırlamak için 1'i tuslayınız\nÇıkış yapmak için ise 2'yi tuşlayınız");
			select = input.nextInt();
		}
		else {
			System.out.println("Yanlış giriş yaptınız");
			
		}
		
		switch(select) {
			case(1):
				System.out.print("Yeni password giriniz ");
				Scanner input2=new Scanner(System.in);
				newPassword=input2.nextLine();
				
				if(newPassword.equals("Agaca")) {
					System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
				}else {
					System.out.println("Şifre oluşturuldu");
					
				}
				break;
			case(2):
				System.out.println("Çıkış işlemi başarılı!");
				break;
		}
			
	}

}
