package oopIntro;

public class ProductManager {
	
	// Classları tutucu ve iş yapıcı olarak iki sınıfta toplarız. Tutucu Product ta özellikleri tuttuk. 
	// ProductManager da ise sepete ekle gibi işleri yapacağımız methodları tutacağız.
	
	// Product Product   parametresi göndererek buna sepete ekleyeceği ürünü gönderme şansın oluyor. 
	// Birden fazla parametre varsa virgül ile ayrılıp yazılabilir.
	
	public void addToCart(Product product) {
		System.out.println("Sepete ekleme kodu simüle edildi!!!");
		System.out.println("Sepete ekleme kodu simüle edildi!!!");
		System.out.println(product.name + " Fiyatı: " + product.unitPrice );
		
	}
	
}
