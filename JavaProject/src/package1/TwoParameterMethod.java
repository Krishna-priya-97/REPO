package package1;

public class TwoParameterMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printName("Priya");
		sum(10,20.04f);
	}
	
static void printName(String name)
{
	System.out.println(name);
}

static void sum(int a,float b)
{
float sum=a+b;
System.out.println(sum);
}
}
