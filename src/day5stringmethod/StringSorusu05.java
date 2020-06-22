package day5stringmethod;

import java.util.Scanner;

public class StringSorusu05 {

	public static void main(String[] args) {
//		5. Kullanýcýnýn girdiði String deðerlerini büyük harfe çeviren 
			//Java kodunu yazýnýz.
			
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Büyük harfe çevrilecek kelime giriniz.");
		String str = sc.nextLine();
		
		System.out.println(str.toUpperCase());

	}

}
