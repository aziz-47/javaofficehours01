package day7methods;

public class Method2 {

	public static void main(String[] args) {
		// iki sayinin esitlik durumnu konrtol eden methodu yaziniz
		
		System.out.println(esitMi(5,5));

	}
	
	public static boolean esitMi(int num1, int num2) {
		if(num1==num2) {
			return true;
		}
		return false;
	}

}
