package dashboard;

// Define a class called 'cars' to represent vehicle specifications
public class cars {
	private int id; // Unique identifier for the car
	private String brand; // Brand or manufacturer of the car
	private String fuelType; // Type of fuel the car uses (e.g., gasoline, diesel)
	private String color; // Color of the car
	private int passengers; // Maximum number of passengers the car can accommodate
	private String gearbox; // Type of gearbox (e.g., automatic, manual)
	private double price; // Price of the car

	// Constructor to initialize the car's properties
	public cars(int id, String brand, String fuelType, String color, int passengers, String gearbox, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.fuelType = fuelType;
		this.color = color;
		this.passengers = passengers;
		this.gearbox = gearbox;
		this.price = price;
	}

	// Getter and setter methods for the car's properties
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public String getGearbox() {
		return gearbox;
	}

	public void setGearbox(String gearbox) {
		this.gearbox = gearbox;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
