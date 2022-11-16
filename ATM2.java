package Three;

import java.util.Scanner;

public class ATM2 {

	public static void main(String[] args) {

		//ATM işlemlerini "Switch-Case" kullanarak yapınız.
		int select, price,balance=1500,right=3;
		String userName,password;
		
		
		
		while(right>0) {
		Scanner input = new Scanner (System.in);
		System.out.print("Kullanıcı adınız: ");
		userName=input.next();
		System.out.print("Şifreniz:");
		password=input.next();
		
	       if (userName.equals("patika") && password.equals("dev123")) {
	    	   System.out.println("X bankasına hoş geldiniz.");
	    	   
	    	do {
	    		 System.out.println("1-Para yatırma\n" +
                       "2-Para Çekme\n" +
                       "3-Bakiye Sorgula\n" +
                       "4-Çıkış Yap");
               System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
               select = input.nextInt();
               switch (select) {
			case 1: 
				 System.out.print("Para miktarı : ");
                  price = input.nextInt();
                  balance+=price;
                  System.out.print("Güncel bakiyeniz:" + balance + "\n");
                  break;
			 case 2:
				System.out.print("Para miktarı : ");
                 price = input.nextInt();
                if (price > balance) {
                    System.out.println("Bakiye yetersiz.");
                    System.out.print("Güncel bakiyeniz:" + balance + "\n");
                    break;
                } else {
                    balance -= price;
                    System.out.print("Güncel bakiyeniz:" + balance + "\n");
                    break;
			
		   }case 3:
               System.out.print("Güncel bakiyeniz:" + balance + "\n");
               break;
  }
	    	}while(select!=4); {
	    		System.out.println("Tekrar görüşmek üzere. ");
	    		break;
	    	}
		
		
	       }else {
	    	   right--;
               System.out.println("Hatalı kullanıcı adı veya şifre girdiniz. ");
	    	   if (right == 0) {
                   System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
               } else {
                   System.out.println("Tekrar deneyiniz.Kalan Hakkınız : " + right);
               }
	       }
	       }
	}

}
