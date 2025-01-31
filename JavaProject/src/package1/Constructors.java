package package1;

public class Constructors {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructors obj=new Constructors();
//Constructors obj1=new Constructors(15);
//Constructors obj2=new Constructors(10.02f);


	}
	
public Constructors()
{
	this(2);
	System.out.println("non parameterised constructor" );
}

public Constructors(int a)
{
	this(3.4f);
	System.out.println(a);
}

public Constructors(float a)
{
	System.out.println(a);
}


}

