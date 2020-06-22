package day6stringvemethod;

import java.util.Scanner;

public class StringKarekterSirasi {

	public static void main(String[] args) {
		// Grilen String deðer içinde istenen indexteki karakteri bulan
		//Java kodunu yazýnýz.
		
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lütfen bir kelime giriniz");
		String str = sc.nextLine();
		System.out.println("Lütfen index numarasýný giriniz.");
		int i = sc.nextInt();
		
		int index = str.charAt(i);
		System.out.println(i + "." + "index karekteri: " + (char)index );


	}

}
