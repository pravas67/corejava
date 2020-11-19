package com.heraizen.cj.day5;

public class Product {
	int pid;
	String pname;
	double price;

	Product(int pid, String pname, double price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static void display(Product product) {
		System.out.format("%-10d%-20s%-20s%n", product.pid, product.pname, product.price);
	}
	public static void swapPrice(Product p1, Product p2) {
		double price=p1.getPrice();
		p1.setPrice(p2.price);
		p2.setPrice(price);
		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
	}
	@Override
	public String toString() {
		return "Product id=" + pid + ", name=" + pname + ", price=" + price ;
	}

	public static void main(String[] args) {
		Product p1 = new Product(1001, "Nutri Choice", 45);
		Product p2 = new Product(1002, "Choco pia", 30);
		Product p3 = new Product(1003, "Kit kat", 20);
		Product p4 = new Product(1004, "Lays", 20);
		Product p5 = new Product(1005, "Kaju", 100);
		Product p6 = new Product(1006, "Mirinda", 50);
		Product p7 = new Product(1007, "Salty Nuts", 20);
		Product p8 = new Product(1008, "veta marie", 45);
		Product p9 = new Product(1009, "Soya stick", 20);
		Product p10 = new Product(1010, "lite chuda", 20);
		Product[] proArr = new Product[] { p1, p2, p3, p4, p5, p6, p7, p7, p8, p9, p10 };
		for (Product p : proArr) {
			Product.display(p);
		}
		System.out.println();
		Product laptop=new Product(100, "laptop", 35000);
		Product desktop=new Product(101, "desktop", 8500);
		Product.swapPrice(laptop, desktop);
	}
}
