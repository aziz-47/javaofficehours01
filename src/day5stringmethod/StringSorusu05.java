package day5stringmethod;

import java.util.Scanner;

public class StringSorusu05 {

	public static void main(String[] args) {
//		5. Kullan�c�n�n girdi�i String de�erlerini b�y�k harfe �eviren 
			//Java kodunu yaz�n�z.
			
			
		Scanner sc=new Scanner(System.in);
		System.out.println("B�y�k harfe �evrilecek kelime giriniz.");
		String str = sc.nextLine();
		
		System.out.println(str.toUpperCase());

	}

}
