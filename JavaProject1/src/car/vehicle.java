package car;

public class vehicle {

	@Override
	public String toString() {
		return "vehicle [name=" + name + ", model=" + model + ", price=" + price + "]";
	}
	private String name;
	private String model;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
