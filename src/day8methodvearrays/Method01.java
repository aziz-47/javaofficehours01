package day8methodvearrays;

import java.util.Scanner;

public class Method01 {

	public static void main(String[] args) {
		//Kullanýcýda bir String kümesi girmesini isteyelim ve Kaç kelimeden 
		//oluþtuðunu dönen java methodu yazýnýz.  
		
		Scanner sc =new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz.");
        String str = sc.nextLine();
        System.out.println("Metindeki kelime sayýsý: " +kelimeSayisi(str));

		

	}
	
	public static  int kelimeSayisi(String str){
        int count=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        count=count +1;
        return count;
    }


}
