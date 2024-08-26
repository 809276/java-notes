package com.inheritance;

//  parent
class Product{
	int productid;
	String productname;
	double price;
	public Product(int productid,String productname,double price) {
		this.productid=productid;
		this.productname=productname;
		this.price=price;
	}
	public void infodisplay() {
		System.out.println("product id:"+productid);
		System.out.println("product name:"+productname);
		System.out.println("produt price:"+price);
	}
}

// first child
class Electronics extends Product{
	int warrentyperiod;
	
	public Electronics(int productid,String productname,double price,int warrentyperiod) {
		super(productid,productname,price);
		this.warrentyperiod=warrentyperiod;
		
	}
	public void infodisplay() {
		super.infodisplay();
		System.out.println("warrent period of product:"+warrentyperiod);
	}
	
}
// second child
class Clothing extends Product{
	double size;
	
	public Clothing(int productid,String productname,double price,double size) {
		super(productid,productname,price);
		this.size=size;
	}
	public void infodisplay() {
		super.infodisplay();
		System.out.println("Cloth size :"+size);
	}
}

public class TestPro {
public static void main(String[] args) {
	Electronics ec=new Electronics(123,"ironbox",299.00,5 );
	ec.infodisplay();
	
	System.out.println();
	
	Clothing c=new Clothing(143, "Rymond", 999.9, 3);
	c.infodisplay();
	
	
}
}
