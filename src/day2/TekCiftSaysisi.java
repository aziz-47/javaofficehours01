package day2;

import java.util.Scanner;

public class TekCiftSaysisi {

	public static void main(String[] args) {
		// // Kullan�c�dan bir say� girmesini isteyiniz
				// Say� tek say� ise "Say�n�z tek say�d�r."
				// Say� �ift say� ise "Say�n�z �ift say�d�r." yazd�r�n�z
				
				Scanner scan= new Scanner (System.in);
				System.out.println("lutsen bir sayi giriniz");
				int num= scan.nextInt();
				
				
				if(num%2==0) {
					System.out.println("cift sayi");
				}else {
					System.out.println("tek sayi");
				}

	}

}
