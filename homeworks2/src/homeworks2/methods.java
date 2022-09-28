package homeworks2;

public class methods {

	public static void main(String[] args) {
		sayiBulmaca();
	}
	
	public static void sayiBulmaca() {

		int[]sayilar =new int[] {1,2,5,7,9,0};
		int aranacakSayi=10;
		Boolean varMi=false;
	
		for(int sayi :sayilar) {
			if(sayi==aranacakSayi) {
				varMi = true;
				break;
			}
		}
		
		if(varMi) {
			//mesajVer(aranacakSayi);//
			mesajVer(("sayı mevcuttur:" + aranacakSayi));
		}else {
			mesajVer(("sayı mevcut değildir:" + aranacakSayi));
		}
		
	}
	
	public static void mesajVer(String mesaj) {
		
		System.out.println(mesaj);
	}
}
