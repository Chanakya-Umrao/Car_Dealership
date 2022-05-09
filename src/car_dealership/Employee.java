package car_dealership;

public class Employee {
	
	//loan amount  = vehicle price - cash in hand
	public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {
		if(finance  == true)
		{
			double loanAmount = vehicle.getPrice() - customer.getCashInHand();
			runCreditHistory(customer, loanAmount);
		}
		else if(vehicle.getPrice()<=customer.getCashInHand())
		{
			processTransaction(customer, vehicle);
		}
		else
		{
			System.out.println("Customer will need more money to purchase the vehicle: " + vehicle);
		}
	}
	
	
	public void runCreditHistory(Customer customer, double loanAmount)
	{
		System.out.println("Credit history of customer....");
		System.out.println("Customer has been approved for purchasing the vehicle..");
	}
	
	public void processTransaction(Customer customer, Vehicle vehicle)
	{
		System.out.println("Customer has purchased the vehicle:  " + vehicle + " for the price " + vehicle.getPrice());
	}
}
