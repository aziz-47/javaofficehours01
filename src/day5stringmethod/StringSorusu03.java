package day5stringmethod;

import java.util.Scanner;

public class StringSorusu03 {

	public static void main(String[] args) {
		// //3. Kullanýcýdan alýnan String kümesi içerisinde aranan  
    //  String i bulan Java Kodunu yazýnýz. 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen cümle giriniz");
        String str =sc.nextLine();
        System.out.println("aranavak kelime giriniz");
        String strbul = sc.nextLine();
        
        System.out.println(str.contains(strbul));


	}

}
