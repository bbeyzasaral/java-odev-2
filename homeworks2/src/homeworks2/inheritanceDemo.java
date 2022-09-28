package homeworks2;

public class inheritanceDemo {

	public static void main(String[] args) {
		
		/*OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.hesapla();*/
		
		KrediUI krediUI= new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager());
	}

}
