package alistirma2;

public class KursManager {

	public void listele (Kurs[] kurslar) {
		
		System.out.println("Kurslar Listelendi ->");
		for (Kurs kurs:kurslar) {
			System.out.println(kurs.id+"."+"Kurs ad�: "+kurs.name);
		}
		System.out.println("");
	}
	
	public void detayGetir(Kurs detay) {
		System.out.println("Detaylar Listelendi ->");
		System.out.println("E�itmen:"+detay.teacher + " - Kurs ad�: "+detay.name +"  Kurs Detay� ->>"+detay.details+"\n");
	}
}
