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
		
	// Kullanýcýdan 3 tane pozitif tam sayý alalým. bu sayýlarla üçgen olup alamayacaðýný
	//kontrol edelim. üçgen ise eþit kenar üçgen mi?
		// a+b>c>a-b 1
		//a+c>b>a-c  1
		//b+c>a>b-c  1
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Lütfen 3 tam sayý griniz.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a+b>c &&a-b<c && b+c>a && b-c<a && a+c>b && a-c<b) {
			
			if(a==b && a==c ) {
				System.out.println("üçgen ve eþkenar üçgen.");
				
			}else {
				System.out.println("üçgen fakat eþkenar üçgen deðil.");
			}
			
			
			
		}else {
			System.out.println("Üçgen deðildir.");
		}
		sc.close();






	}

}
