package Two;

import java.util.Scanner;

public class KullanıcıGirişi {

	public static void main(String[] args) {
		
		String userName,password,change,newPassword;
		Scanner input = new Scanner (System.in);	
		System.out.print("Kullanıcı adınız: ");
		userName=input.nextLine();
		System.out.print("Şifreniz: ");
		password=input.nextLine();
		
		if(userName.equals("patika")&&(password.equals("java123"))) { 
			System.out.println("Giriş yaptınız.");
			
		}else if(userName.equals("patika")&&(!(password.equals("java123")))){
			System.out.print("Girdiğiniz şifre hatalı!Şifreyi değiştirmek ister misiniz?: (evet/hayır)");
			change=input.nextLine();
			if(change.equals("evet")) {
				System.out.print("Yeni şifre: ");
				newPassword=input.nextLine();
				if (newPassword.equals("java123")){
					System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
				}else
					System.out.println("Şifre oluşturuldu.");
			}
		}

		
		else {
			
			System.out.println("Girdiğiniz kullanıcı bilgileri hatalı.Lütfen tekrar deneyiniz!");
		}
		
	}
}
