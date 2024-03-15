package myobj;

public class extend {
	
	public static void main(String[] args) {
		Shoes s1 = new Shoes("크록스", "화이트", 60000);
		Shoes s2 = new Shoes("컨버스", "블랙", 80000);
		
		s1.goodfit();
		
	}
}

class Shoes{
	String brand;
	String color;
	int price;
	int size;
	int cushioning;
	
	public Shoes(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void goodfit() {
		++cushioning;
	}
	void badfit() {
		--cushioning;
	}
}





