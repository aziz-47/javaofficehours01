package day5stringmethod;

import java.util.Scanner;

public class StringSorusu04 {

	public static void main(String[] args) {
		//4. Kullan�c�dan al�nan Stringin son karakteirini silep 
		//	ekrana yazan Java kodunu yaz�n�z.
			
			Scanner sc= new Scanner(System.in);
			System.out.println("L�tfen kelime giriniz");
			String str =sc.nextLine();
			
			System.out.println(str.substring(0, str.length()-1));
			
			
	}

}
