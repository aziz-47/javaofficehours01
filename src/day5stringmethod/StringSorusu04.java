package day5stringmethod;

import java.util.Scanner;

public class StringSorusu04 {

	public static void main(String[] args) {
		//4. Kullanýcýdan alýnan Stringin son karakteirini silep 
		//	ekrana yazan Java kodunu yazýnýz.
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Lütfen kelime giriniz");
			String str =sc.nextLine();
			
			System.out.println(str.substring(0, str.length()-1));
			
			
	}

}
