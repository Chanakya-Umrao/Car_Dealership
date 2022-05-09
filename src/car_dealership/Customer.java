package car_dealership;

public class Customer {
	
	private String name;
	private String address;
	private double cashInHand;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getCashInHand() {
		return cashInHand;
	}

	public void setCashInHand(double cashInHand) {
		this.cashInHand = cashInHand;
	}

	public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance)
	{
		employee.handleCustomer(this, finance, vehicle);
	}

	public Customer(String name, String address, double cashInHand) {
		super();
		this.name = name;
		this.address = address;
		this.cashInHand = cashInHand;
	}

	

}
