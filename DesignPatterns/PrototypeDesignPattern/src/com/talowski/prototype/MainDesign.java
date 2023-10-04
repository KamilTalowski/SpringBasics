package com.talowski.prototype;

public class MainDesign {
	public static void main(String a[]) throws CloneNotSupportedException 
	{
		BookShop bs = new BookShop();
		bs.setShopName("Novelty");;
		bs.loadData();

		

		
//		BookShop bs1= new BookShop();
//		bs1.setShopName("A1");
//		bs1.loadData();
//		System.out.println(bs1);
		
		BookShop bs1= (BookShop) bs.clone();
		bs1.setShopName("A1");
		
		bs.getBooks().remove(2);
		
		System.out.println(bs);
		System.out.println(bs1);
	}


	
}
