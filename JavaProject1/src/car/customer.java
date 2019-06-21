package car;

public class customer {
	private String name;
	private String add;
	private double CashInHand;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public double getCashInHand() {
		return CashInHand;
	}
	public void setCashInHand(double cashInHand) {
		CashInHand = cashInHand;
	}
	public void purchase(vehicle v,employee emp,boolean fin)
	{
		emp.handlecustomers(this, v, fin);
	}
	@Override
	public String toString() {
		return "customer [name=" + name + ", add=" + add + ", CashInHand=" + CashInHand + "]";
	}

}
