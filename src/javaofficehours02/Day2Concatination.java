package javaofficehours02;

import java.util.Scanner;

public class Day2Concatination {

	public static void main(String[] args) {
		// // 5 + "Ali" 
		//"Ali" + 5+5
		
		// 5+5 "Ali" 4+3
//		
//		System.out.println(5 + "Ali");
//		System.out.println("Ali" + (5+5));
//		System.out.println(5+5 + "Ali" + (4+3));
//		
//		
//		System.out.println(1==3);
//		System.out.println(2==2);
		
	// Kullan�c�dan 3 tane pozitif tam say� alal�m. bu say�larla ��gen olup alamayaca��n�
	//kontrol edelim. ��gen ise e�it kenar ��gen mi?
		// a+b>c>a-b 1
		//a+c>b>a-c  1
		//b+c>a>b-c  1
		
		Scanner sc=new Scanner(System.in);
		System.out.println("L�tfen 3 tam say� griniz.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a+b>c &&a-b<c && b+c>a && b-c<a && a+c>b && a-c<b) {
			
			if(a==b && a==c ) {
				System.out.println("��gen ve e�kenar ��gen.");
				
			}else {
				System.out.println("��gen fakat e�kenar ��gen de�il.");
			}
			
			
			
		}else {
			System.out.println("��gen de�ildir.");
		}
		sc.close();






	}

}
