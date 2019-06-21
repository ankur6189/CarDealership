package car;
public class employee {
	public void handlecustomers(customer cust,vehicle v,boolean fin)
	{
		if(fin==true)
		{
			double loan=v.getPrice()-cust.getCashInHand();
			runCreditHistory(cust,loan);
		}
		else if(cust.getCashInHand()>=v.getPrice())
		{
			transaction(cust,v);
		}
		else
		{
			System.out.println("Customer bhikari hai...");
		}
	}
	public void runCreditHistory(customer cust,double loan)
	{
		System.out.println("Ran credit history...");
		System.out.println("purchase approved...");
		
	}
	public void transaction(customer cust,vehicle v)
	{
		System.out.println("Customer "+cust+ " has purchased the "+v);
	}

}
