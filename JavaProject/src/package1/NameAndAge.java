package package1;

public class NameAndAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//to set your name and age by a instance method
		NameAndAge newobj=new NameAndAge();
		newobj.Name();
		
		NameAndAge newobj1=new NameAndAge();
		newobj1.Age();
	}

	public void Name()
{
		System.out.println("Name:KRISHNAPRIYA KARIMBIL");
}
	
	public void Age()
	{
		System.out.println("Age:27");
	}
}
