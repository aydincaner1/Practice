package alistirma2;

public class KursManager {

	public void listele (Kurs[] kurslar) {
		
		System.out.println("Kurslar Listelendi ->");
		for (Kurs kurs:kurslar) {
			System.out.println(kurs.id+"."+"Kurs adı: "+kurs.name);
		}
		System.out.println("");
	}
	
	public void detayGetir(Kurs detay) {
		System.out.println("Detaylar Listelendi ->");
		System.out.println("Eğitmen:"+detay.teacher + " - Kurs adı: "+detay.name +"  Kurs Detayı ->>"+detay.details+"\n");
	}
}
