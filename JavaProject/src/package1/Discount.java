 package package1;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//to check whether the customer have discount or not-20% discount if total amount is greater than 5000-and get the final amount in main method
	Discount newobj=new Discount();
	double a=newobj.Discountamt(5000);
	double b=newobj.Totalamt(5000,a);
	System.out.println(b);
	}

	public double Discountamt(double amt)
	{
	if(amt>5000)
	{
		double discount=amt*0.2;
		return discount;
	}
	else 
	{
		return amt;
	}
	}
	
	public double Totalamt(double amt,double discount)
	{
	double FinelAmt=amt-discount;
	return FinelAmt;
	}
	}

