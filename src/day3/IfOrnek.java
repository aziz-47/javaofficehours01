package day3;

import java.util.Scanner;

public class IfOrnek {

	public static void main(String[] args) {
		// Kullanicdan yasiniz allaim 18 yasindan kucuk ise kan bagisi yapmasin
		//18 den butyuk ve 50 kilodan zayif ise yine kan veremezsin
		//18 yasindan buyuk ve 50 kilodan fazla ise kan verebilsin 
		

		Scanner sc =new Scanner(System.in);
		System.out.println("L�tfrn ya��n�z� giriniz");
		int yas=sc.nextInt();
		System.out.println("L�tfrn kilonuzu giriniz");
		int kilo= sc.nextInt();
		
		if(yas>=18) {
			
			if(kilo>=50) {
				System.out.println("Kan verebilirsiniz.");
				
			}else {
				System.out.println("50 kilodan zay�flar kan veremez.");
			}
			
		}else {
			System.out.println("18 ya��ndan k���kler kan veremez.");
		}
		
		
		
		String result= (yas>=18 ? kilo>=50 ? "Kan verebilirsiniz." :"50 kilodan zay�flar kan veremez." :"18 ya��ndan k���kler kan veremez.");
		System.out.println(result);
		
		
	}

}
