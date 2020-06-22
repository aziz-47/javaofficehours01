package day2;

import java.util.Scanner;

public class TekCiftSaysisi {

	public static void main(String[] args) {
		// // Kullanýcýdan bir sayý girmesini isteyiniz
				// Sayý tek sayý ise "Sayýnýz tek sayýdýr."
				// Sayý çift sayý ise "Sayýnýz çift sayýdýr." yazdýrýnýz
				
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
