package car;

public class Dealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer cust = new customer();
		cust.setName("john");
		cust.setAdd("wall Street");
        cust.setCashInHand(12000);
        
		vehicle v=new vehicle();
		v.setPrice(10000);
		v.setModel("Top model");
		v.setName("Honda City");
		employee emp = new employee();
		cust.purchase(v, emp, false);
	}

}
