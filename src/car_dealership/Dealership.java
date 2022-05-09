package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		Customer customer1 = new Customer("Jack", "12-Jack st..", 20000);
		
		
		Vehicle vehicle = new Vehicle("Audi","A6",10000);
		
		Employee employee = new Employee();
		
		Vehicle car = new Vehicle("BMW","M3",20000);
		boolean value = car.equals(vehicle);
		System.out.println(value);
		customer1.purchaseCar(vehicle, employee, false );
	}

}
