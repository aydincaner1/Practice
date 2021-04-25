package alistirma2;

public class Application {
	
	public static void main(String[] args) {
		
		Kurs kurs1 = new Kurs(1,"Java-Spring","Caner ","Backend");
		Kurs kurs2 = new Kurs(2,"React","Aydın","Frontend");
		
		Kurs[] kurslar= {kurs1,kurs2};
		
		KursManager manager= new KursManager();
		manager.listele(kurslar);
		manager.detayGetir(kurs1);
		manager.detayGetir(kurs2);
	}
}