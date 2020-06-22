package day7methods;

public class Method03 {

	public static void main(String[] args) {
		// Girilen sayinin tersini return eden hava kodunu yazniz?
		
		System.out.println(sayininTersi(6987));//6987
		

	}
	
	public static int sayininTersi(int n) {
		 
		int sonuc = 0;
		
		while(n>0) {
			
			int sayi=n%10;
			n/=10;
			sonuc= sonuc*10+sayi;
		}
		
		return sonuc;
	}

}
