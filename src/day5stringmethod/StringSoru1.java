package day5stringmethod;

import java.util.Scanner;

public class StringSoru1 {

	public static void main(String[] args) {
		//Girilen String de�erde tersten yazan Java kodunu yaz�n�z.
		// 1. Girilen String de�eri tersten yazan Java kodunu yaz�n�z.
				Scanner sc=new Scanner(System.in);
				System.out.println("L�tfen kelime giriniz.");
				String str =sc.nextLine();
				
				int countStr =str.length();
				
				while (countStr>0) {
					System.out.print(str.charAt(countStr-1));
					
					countStr--;
				}

		
		
	}

}
