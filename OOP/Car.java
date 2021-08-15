public class Car {
	public String brand;
	public String type;
	public String color;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return this.brand;
	}

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setBrand("BMW");
		System.out.println(myCar.getBrand());

		for (int i = 0;i < 10; i++) {
			System.out.println("Creating Car id: " + i);
		}
	}
}