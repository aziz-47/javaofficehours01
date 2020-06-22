package day5stringmethod;

import java.util.Scanner;

public class StringSoru1 {

	public static void main(String[] args) {
		//Girilen String deðerde tersten yazan Java kodunu yazýnýz.
		// 1. Girilen String deðeri tersten yazan Java kodunu yazýnýz.
				Scanner sc=new Scanner(System.in);
				System.out.println("Lütfen kelime giriniz.");
				String str =sc.nextLine();
				
				int countStr =str.length();
				
				while (countStr>0) {
					System.out.print(str.charAt(countStr-1));
					
					countStr--;
				}

		
		
	}

}
