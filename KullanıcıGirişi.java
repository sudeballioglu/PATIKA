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
		
		if(userName.equals("patika")&&(password.equals("java123"))) { //when we use String, we cannot use ==.
			//we can use .equals to control our condition.
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
		
		/*
		 * Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp 
		 * sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse
		 *  yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile 
		 *  aynı olmaması gerektiğini kontrol edip , şifreler aynı ise
		 *   ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." 
		 *   sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
		 */
		
		
	}
}
