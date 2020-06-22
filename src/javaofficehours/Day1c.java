package javaofficehours;

import java.util.Scanner;

public class Day1c {

	public static void main(String[] args) {
		// Kullnican 5 basamkli tam sayi allaim ve bu sayinin bstan 2 ve sondan 2 rakamalrinin
		//basamak degrleri ile  toplama sonucunu yazdiralim
		
		Scanner scan= new Scanner(System.in);
		System.out.println("5 basamakli bir sayi giriniz");
		int num= scan.nextInt();
		
		int ilkIki= num/1000;
		System.out.println(ilkIki);
		ilkIki= ilkIki*1000;
		
		
		int sonIki= num%100;
		System.out.println(sonIki);
		
		int sum= ilkIki+ sonIki;
		System.out.println(sum);
		

	}

}
