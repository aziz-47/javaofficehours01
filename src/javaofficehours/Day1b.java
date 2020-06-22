package javaofficehours;

import java.util.Scanner;

public class Day1b {

	public static void main(String[] args) {
		// Kullanicdnaa 2 sayi alin ve bu sayilarin dort islem sonucu ekrana yazdirlaim
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Birinci sayii giriniz");
		double num1= scan.nextDouble();
		System.out.println("Ikinci sayiyi giriniz");
		double num2= scan.nextDouble();
		
		 double toplama = num1+ num2;
		 System.out.println("toplma :" + toplama);
		 
		 double cikarma = num1- num2;
		 System.out.println("cikarma: " + cikarma);
		 
		 double carpma = num1*num2;
		 System.out.println("carpma: " + carpma);
		 
		 double bolme = num1/ num2;
		 System.out.println("bolme : " + bolme);
		
			

	}

}
