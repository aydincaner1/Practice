package odev6document;

public class Printer {

	//static olarak çağırmasak nesne erişmemiz gerekirdi, bu şekilde direk kurucu method üzerinden veri çekebilip gönderebildik.
	
	public static void printPDFDocument(PDFDocument pdf) {
		System.out.println("PDF Belge Body->");
		System.out.println(pdf.getBody());
		System.out.println();
	}

	public static void printWordDocument(WordDocument word) {
		System.out.println("Word Belge Body->");
		System.out.println(word.getBody());
	}

}
