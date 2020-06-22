package day2;

import java.util.Scanner;

public class StringSorusuTekrar {

	public static void main(String[] args) {
		 /* 
        scanner kullanarak aþaðýdaki sorulara cevaplar isteyiniz
        1.Adým: 3 adet String tanýmlayýnýz. ad, soyad, rapor
        2.Adým: 2 adet integer tanýmlayýnýz  doðum yýlý, þimdiki yýl
        3.Adým: Kullanýcýdan; "Lütfen adýnýzý ve soy adýnýzý giriniz:" isteyin
                 Harun
                 Ekinci
        4.Adým: Kullanýcýdan;"Lütfen doðum yýlýnýzý ve þimdiki yýlý giriniz:" isteyin
                 1983
                 2020        
        5.Adým Raporu aþaðýdaki gibi yazdýrýnýz      
                "Adýnýz: Harun, Soy adýnýz: Ekinci, Yaþýnýz: 37"
        6. Adým: Yaþýnýz,Adýnýzýn ilk harfi, soyadýnýzýn ilk ve son harfi, isim ve soyisim karakter uzunluklarýný içeren bir þifre oluþturunuz
           //Þifre= 37HEi56        
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
