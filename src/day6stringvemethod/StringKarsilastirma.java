package day6stringvemethod;

import java.util.Scanner;

public class StringKarsilastirma {

	public static void main(String[] args) {
		//Girilen iki String veriyi kar��la�t�ran Java kodu yaz�n�z.
		//	ayn�ise True farkl� ise false return etsin.
		
		Scanner sc =new Scanner(System.in);
		System.out.println("L�tfen 1 kelime giriniz.");
		
		String str1 =sc.nextLine();
		System.out.println("L�tfen 1 kelime giriniz.");
		String str2 = sc.nextLine();
		
		System.out.println(str1.equals(str2));

		
		
	}

}
