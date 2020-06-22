package javaofficehours02;

import java.util.Scanner;

public class Day2Mouduls {

	public static void main(String[] args) {
		// Kullnicdan 5 basamakli pozitif tam sayi alalim ve her raakamini yazdirlaim
		
		Scanner scan= new Scanner(System.in);
		System.out.println("5 basamakli bir pozitif tam sayi giriniz");
		int num= scan.nextInt();
		
		int onbinler= num/10000;
		System.out.println("onbinler: " + onbinler);
		
		int binler =(num/1000)%10;
		System.out.println("binler: " +binler);
		
		int yuzler = (num/100)%10;
		System.out.println("yüzler: " + yuzler);
		
		int  onlar = ((num%1000)%100)/10;
		System.out.println("onlar: " +onlar);
		int birler = ((num%1000)%100)%10;
		System.out.println("birler: " + birler);
	}

}
