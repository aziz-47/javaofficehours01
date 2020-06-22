package javaofficehours02;

import java.util.Scanner;

public class Day3Ebob {

	public static void main(String[] args) {
		// /kullanýcýdan 2 pozitif tam sayý alacaðýz. ebob   55 121 => 11
		 //  12 24 =>12
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Lütfen 1. pozitif tam sayý giriniz.");
		
		int num1= sc.nextInt();
		System.out.println("Lütfen 2. pozitif tam sayý giriniz.");
		int num2 = sc.nextInt();
		
		int obeb=0;
		for (int i = 1; i <=num1 && i<=num2; i++) {
			
			if(num1%i==0 || num2%i==0) {
				obeb=i;
			}
			
		}System.out.println(num1 + " ve " + num2 + " ortak böleni: " + obeb);

		

	}

}
