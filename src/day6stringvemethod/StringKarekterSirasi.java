package day6stringvemethod;

import java.util.Scanner;

public class StringKarekterSirasi {

	public static void main(String[] args) {
		// Grilen String de�er i�inde istenen indexteki karakteri bulan
		//Java kodunu yaz�n�z.
		
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("L�tfen bir kelime giriniz");
		String str = sc.nextLine();
		System.out.println("L�tfen index numaras�n� giriniz.");
		int i = sc.nextInt();
		
		int index = str.charAt(i);
		System.out.println(i + "." + "index karekteri: " + (char)index );


	}

}
