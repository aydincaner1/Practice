package alistirma3inheritance;


public class ProductManager {

	public void addToCart(Product product) {
		System.out.println("Sepete Eklendi : "+product.getName());
	}
	
	public void allCartList(Product[] products) {
		
		for (Product product:products){
			System.out.println("Sepeteki ürünler : "+product.getName());
		}
		
	}
}
