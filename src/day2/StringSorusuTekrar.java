package day2;

import java.util.Scanner;

public class StringSorusuTekrar {

	public static void main(String[] args) {
		 /* 
        scanner kullanarak a�a��daki sorulara cevaplar isteyiniz
        1.Ad�m: 3 adet String tan�mlay�n�z. ad, soyad, rapor
        2.Ad�m: 2 adet integer tan�mlay�n�z  do�um y�l�, �imdiki y�l
        3.Ad�m: Kullan�c�dan; "L�tfen ad�n�z� ve soy ad�n�z� giriniz:" isteyin
                 Harun
                 Ekinci
        4.Ad�m: Kullan�c�dan;"L�tfen do�um y�l�n�z� ve �imdiki y�l� giriniz:" isteyin
                 1983
                 2020        
        5.Ad�m Raporu a�a��daki gibi yazd�r�n�z      
                "Ad�n�z: Harun, Soy ad�n�z: Ekinci, Ya��n�z: 37"
        6. Ad�m: Ya��n�z,Ad�n�z�n ilk harfi, soyad�n�z�n ilk ve son harfi, isim ve soyisim karakter uzunluklar�n� i�eren bir �ifre olu�turunuz
           //�ifre= 37HEi56        
        */
		
		Scanner scan= new Scanner(System.in);
		String ad,soyAd,rapor;
		int dyil,syil;
		
		System.out.println("Lutfen adinizi giriniz");
		ad= scan.nextLine();
		System.out.println("Lutefn soadiniz giryiniz");
		soyAd= scan.nextLine();
		System.out.println("Lutfen dogum yiliniz giriniz griniz");
		dyil= scan.nextInt();
		System.out.println("lutfen simdiki yii giriniz");
		syil= scan.nextInt();
		int yas= syil-dyil;
		
		rapor= ("Adiniz: " + ad+ " soyadinzi: "+   soyAd + " yasiniz: " + yas);
		
		System.out.println(rapor);
		String sifre= (yas+ad.substring(0,1)+soyAd.charAt(0)+soyAd.charAt(soyAd.length()-1)+ ad.length()+soyAd.length());
		System.out.println(sifre);
		
		
		
		
		
		
		
		
		

	}

}
