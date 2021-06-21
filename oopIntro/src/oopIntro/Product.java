package oopIntro;

public class Product {
	
	// constructor (yapıcı) yani bu class tan bir nesne oluşturuldugu an gerçekleşmesini istediğimiz şeyleri buraya yazarız.
	// Product product1 = new Product();   oluşturuldugu anda bu constructor blogu çalışır.
	public Product() {
		System.out.println("Buradayım....");
		
		}
	int id;
	String name;
	double unitPrice;
	String detail;
	
	// constructor birden fazla aynı isimde olabilir ve buna imza(signature) denir. Birden fazla constructordan sadece 1 i yani kullanılan çalışır.
	public Product(int id, String name, double unitPrice, String detail) {
		this();  // bu su demek imzadan nesne oluşturuldugunda yularıdaki argümansız constructor ı çalıştır ömce sonra bunu çalıştır. 
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
		
		}
	
	
	

}
