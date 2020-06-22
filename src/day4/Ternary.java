package day4;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		//Kullanicdan alinacak sayininn negatif pozitif yada notr olup olmadigini kontrol eden ternary yazalim
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen bir sayu giriniz");
		double num= scan.nextDouble();
		
		String result= num<0 ? "negatif" : num>0 ? "pozitif" : "notr";
		System.out.println(result);

	}

}
