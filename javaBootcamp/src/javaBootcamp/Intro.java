package javaBootcamp;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String internetSubeButonu = "İnternet şubeye gir";
		double dolarDun=8.20;
		double dolarBugun=8.22;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun){
			System.out.println("Dolar düştü resmi");	
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar arttı resmi");	
		}else {
			System.out.println("Dolar değişmedi resmi");	
		}
		
		
		String[] krediler = 
			{
					"Hızlı Kredi",
					"Mutlu Emekli Kredisi",
					"Konut Kredisi",
					"Çiftçi Kredisi",
					"Msb Kredisi",
					"Meb Kredisi"
			};
		
		//foreach döngüsü
		for(String kredi : krediler) {
			System.out.println(kredi);	
		}
		
		//for döngüsü 
		for(int i=0; i<krediler.length; i++) {
			System.out.println(krediler[i]);	
		}
		
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;   // burada değer değişir
		sayi2 = 100;  
		System.out.println(sayi1);  // Bu durumda sayi1 = 20 olur çünkü bellekteki yeri değil sadece değeri değişir.
		
		
				
		int[] sayilar1 = {1, 2, 3, 4, 5};
		int[] sayilar2 = {10, 20, 30, 40, 50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;    // burada referans tipi değişir.
		System.out.println(sayilar1[0]);  // Bu durumda sayilar1[0] = 100 olur çünkü bellekteki tutuldugu yer değişir.
		
		
		// String  lerde referans tipleri değişmeli normalde ama bu istisnadır ve değer değişir. 
		String sehir1 = "Ankara";
		String sehir2 = "İstanbul";
		sehir1 = sehir2;
		sehir2 = "İzmir";
		System.out.println(sehir1);  // istanbul olur çünkü değer değişir String tiplerinde.
		

	}

}
