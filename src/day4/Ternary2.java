package day4;

import java.util.Scanner;

public class Ternary2 {

	public static void main(String[] args) {
		// Kulanicdan bir harf isteyelim ve bunun buyuk harf kucuk harf yada hatali griris
		// olma durumunu ternary ile kontrol ediniz
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen bir character giriniz");
		
		char ch= scan.next().charAt(0);
		
		String result = ch>='a' && ch<='z' ? "K���k harf": ch >='A' && ch<='Z'? 
				"B�y�k harf":"Hatal� giri�";
		System.out.println(result);






	}

}
