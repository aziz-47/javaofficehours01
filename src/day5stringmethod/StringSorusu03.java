package day5stringmethod;

import java.util.Scanner;

public class StringSorusu03 {

	public static void main(String[] args) {
		// //3. Kullan�c�dan al�nan String k�mesi i�erisinde aranan  
    //  String i bulan Java Kodunu yaz�n�z. 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("L�tfen c�mle giriniz");
        String str =sc.nextLine();
        System.out.println("aranavak kelime giriniz");
        String strbul = sc.nextLine();
        
        System.out.println(str.contains(strbul));


	}

}
