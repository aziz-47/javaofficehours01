package day5stringmethod;

import java.util.Scanner;

public class StringSorusu02 {

	public static void main(String[] args) {
		// 2 farkl� String'i  ucuca ekleyen Java Kodunu yaz�n�z.
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("eklenecek 1. kelimey giriniz");
		String str1 = sc.nextLine();
		System.out.println("eklenecek 2. kelimeyi giriniz");
		String str2 = sc.nextLine();
		System.out.println(str1.concat(str2));



	}

}
