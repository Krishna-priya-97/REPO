package package1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//program to find the factorial of a number
		
		Factorial newobj=new Factorial();
		newobj.Factorialofnum(4);
	}

public void Factorialofnum(int a)
{
	int fact =1;
	for(int n=2;n<=a;n++)
	{
		
		fact=fact*n;
	}
	System.out.println("factorial of "+a+"is "+fact);

}
}
