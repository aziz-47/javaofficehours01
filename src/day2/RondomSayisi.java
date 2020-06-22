package day2;

public class RondomSayisi {

	public static void main(String[] args) {
		// /0 ile 1000 arasýnda random bir sayý oluþturarak bu sayýnýn rakamlarý toplamýný veren 
				//java algoritma kodunu yazýnýz ?	
				//random sayi= 185  toplamlarý = 14
				
				// 0 ile 1000 arasý sayý
				//int ramdomSayi= (int)(Math.random()*10)+10; // 10 ile 20 arasý deðerler
				        //Random random= new Random();
				        
				    //  int randomSayi = random.nextInt(1000);
				        int randomSayi= (int)(Math.random()*1000);
				        System.out.println("Random sayý="+randomSayi);
				    int birler = randomSayi%10; // birler basamaðý
				    
				      randomSayi= randomSayi/10;
				    
				    int onlar = randomSayi%10; // onlar basamaðý
				    int yuzler= randomSayi/10; // yüzler basamaðý
				    
				    System.out.println("Toplamlarý= "+(birler+onlar+yuzler));
				    
	}

}
