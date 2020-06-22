package day1;

public class Veriable {

	public static void main(String[] args) {
System.out.println("Zafer Eke");
		
		//Asagidakilerde ne tur yanlisliklar vardir? Ekrana dogru hallerini yazdiriniz.
		
		
        /*   int nm =11 ;
           System.out.println(nm);
           String str = "Merhaba";
           System.out.println("Merhaba");
           char ch = 'T';
           System.out.println(ch);
           
           boolean bl = true;
           System.out.println(bl);
           long ln = 1324;
           System.out.println(ln);
           double dl = 62.0;
           System.out.println(dl);
           
           float fl = 5.2f;
           System.out.println(fl);
         */  
           
           
           
         //  Asagidaki sonuc nedir?
     	    //     int harf = '1';
     	      //   char ch1  = '2' ;
     	         
        	
       	/*         System.out.println(harf+ch1); //12 mi?, 3 mu? 99 mu?
       	         
       	      System.out.println(17 + 3); //20
       	   System.out.println(17 + "" + 3 ); //173
       	   System.out.println("" + 17 + 3); //173
       	   System.out.println(17 + 3 + ""); //20
       	   System.out.println(24 + 3 + 6 + "Ali" +10 + 5 ); //33Ali105
       	   System.out.println("" + 24 + 3 + 6  +10 ); //243610
       */	         
        	         
        	
       	    /*    System.out.println(harf); // 1 mi? 49 mu?//49
        	
      	        System.out.println(ch1); // 2 mi? 50 mi?//2
        	
       	           char deneme = 50;
        	
      	         System.out.println(deneme); // 2 mi? 50 mi?
      	         
           */
		
		
		
		   // '!', '%', '*' '$', '@', '&' sembollerinin ASCII Code degerlerini bulunuz.
		
	/*	
		int unlem = '!';
		System.out.println(unlem);
		int yuzde = '%';
		System.out.println(yuzde);
		int star = '*';
		System.out.println('*'+ " Ascii Code Degeri; " + star );
		int dolar = '$';
		System.out.println('$'+ " Ascii Code Degeri; " + dolar );
		int atIsareti = '@';
		System.out.println('@'+ " Ascii Code Degeri; " + atIsareti );
		int veSembolu = '&';
		System.out.println('&'+ " Ascii Code Degeri; " + veSembolu );
		
	*/	
		
		// int ve long tipinin max ve min degerlrini bulup ekrana yazdiuriniz
		
		/*   int maxValue = Integer.MAX_VALUE; // <--- ileride baska bir code icerisinde kullanilabilir
	        System.out.println(maxValue);
	        System.out.println(Integer.MAX_VALUE);
	        int minValue = Integer.MIN_VALUE;
	        System.out.println(minValue);
	        int yeniValue = maxValue + minValue;
	        System.out.println(yeniValue);
	        int yuksekDeger = 2_147_483_647; //2147483647
	        System.out.println(yuksekDeger + " Alt Cizgili");
//	        int telefon = 5352003030;
	        String tlf = "5352003030";
	        double tfln = 535.200_3030;
	        int dusukDeger = -2_147_483_648;
	        long maxLng = Long.MAX_VALUE; //9223372036854775807
	        System.out.println(maxLng);
	        long tlfLng = 535_200_3030L;
	        System.out.println(tlfLng);
	        long minLng = Long.MIN_VALUE; //-9223372036854775808
	        System.out.println(minLng);
	        long yeniLong = maxLng + minLng;
	        System.out.println(yeniLong);
     */       
		
		
		
		//Kullanicidan iki farkli kelime yazsin - (String) olarak
		//Program  bu kelimeleri beraberce ekrana yazdirsin ve sonuna unlem isareti eklesin.
		/* NOT ; ---> String'leri kullanicidan almak icin ya next() veya nextLine()
		kullaniriz. next() tek kelimelik String'ler icin kullanilir.
		Space gorunce String'i almayi birakir.
		nextLine() girilen tum String'i almak icin kullanilir.*/
		
		
//		Scanner scan= new Scanner (System.in);
//		System.out.println("1 . kelime giriniz");
//		String str1= scan.next();
//		
//		System.out.println("2. kelime giriniz");
//		String str2= scan.next();
//		
//		 System.out.println(str1 + " " + str2 + "!");
		
		
		
		
		
		
		
		
		
		
//       //	/*
//		Kullanici  iki sayi girsin // num1 = 2  , num2 = 5
//		Program girilen sayilarin karesini ayri ayri ekrana yazdirsin // ilk sayinin karesi 4.
//		                                  // ikinci sayinin karesi 25
//		Ayri olarak; Program girilen sayilari ayri ayri 5 ile carpimini
//		ve sonucunu ekrana yazdirsin. // ilk sayinin 5 ile carpimi 10
//		                          // ikinci sayinin 5 ile carpimi 25
//		Ayri olarak; Program girilen sayilara ayri ayri 12 eklesin //
//		Ayri olarak; Program girilen sayilardan ayri ayri 5 cikarsin // */
//		    Scanner scan = new Scanner(System.in);
//		    System.out.println("Lutfen 1. Sayiyi Giriniz");
//		    int num1 = scan.nextInt();
//		    System.out.println("Lutfen 2. Sayiyi Giriniz");
//		    int num2 = scan.nextInt();
//		    int ilkKare = num1*num1;
//		    System.out.println("Ilk Sayinin Karesi; " + ilkKare);
//		    int ikinciKare = num2*num2;
//		    System.out.println("Ilk Sayinin Karesi; " + ikinciKare);
//		    int ilk5Carp = num1*5;
//		    System.out.println(ilk5Carp);
//		    int ikinci5Carp = num2*5;
//		    System.out.println(ikinci5Carp);
//		    int eklenecekSayi = 12;
//		    int ilk12Ekle = num1+eklenecekSayi;
//		    System.out.println("ilk 12 Ekle; "+ilk12Ekle);
//		    int ikinci12Ekle = num2+eklenecekSayi;
//		    System.out.println(ikinci12Ekle);
//		    int cikarilacakSayi = 5;
//		    int ilk5Cikar = num1-cikarilacakSayi;
//		    System.out.println(ilk5Cikar);
//		    int ikinci5Cikar = num2 - cikarilacakSayi;
//		    System.out.println(ikinci5Cikar);
//		
		
		
		/* Operators
		1)Parantez ici islemler yapilir
		2)Carpma ve bolmeler yapilir.Carpma ve bolmeden soldaki once yapilir.
		3)Toplama ve cikarmalar yapilir.Toplama ve cikarmadan soldaki once yapilir.
		*/
//		     int i1 = 23;
//		     int i2 = 15;
//		     int i3 = 38;
//		     int i4 = 14;
//		     
//		     
//		     //i1 + i2*i3 = ?
//		     //i1*i2 + i3*i4 = ?
//		     //(i1+i2)/i4 = ?
//		     //i4 * (i2 + i1 / 3 ) = ?
//		     
//		     
//		     System.out.println(i1+ i2*i3);
//		     System.out.println(i1*i2 + i3*i4);
//		     System.out.println((i1+i2) / i4);
//		     System.out.println(i4 * (i2+i1/i3));
		
		
		
		
		// Interview Sorusu
		//Iki tane variable'in degerlerini yer degistiriniz
		// sayi1=23, sayi2=54 ==> sayi1=54, sayi2=23 (Bu isleme swap denir)
	     
		
//		int sayi1= 23;
//		int sayi2=  54;
//		
//		System.out.println("degismeden onceki halleri");
//		
//		System.out.println(sayi1);
//		System.out.println(sayi2);
//		
//		int gecici=0;
//		
//		gecici= sayi1;
//		sayi1= sayi2;
//		sayi2= gecici;
//		
//		
//		System.out.println("degistikten sonraki halleri");
//		System.out.println(sayi1);
//		System.out.println(sayi2);
//		System.out.println(gecici);
//		
		
		// gecici kullnamdan
//		
//		int sayiA= 67;
//		int sayiB= 12;
//		
//		System.out.println("degismeden onceki haleri");
//		
//		System.out.println(sayiA);
//		System.out.println(sayiB);
//		
//		
//		sayiA= sayiA+ sayiB;
//		sayiB= sayiA-sayiB;
//		sayiA= sayiA-sayiB;
//		
//		System.out.println(sayiA);
//		System.out.println(sayiB);
//		
		
	}

}
