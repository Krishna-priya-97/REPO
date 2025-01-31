package package1;

public class Voters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//to check whether the canidate is eligible for voting
	
		Voters newobj=new Voters();
		boolean age=newobj.VotersAge(18);
		if(age==true)
		{		
		System.out.println("Eligible for voting");
		}
		else
		{
		System.out.println("Not eligible for voting");
	}
		}
public boolean VotersAge(int age)
	{
	if(age>=18)
	{
	return true;
    }
	
	else
	{
	return false;
	}
}
}
	
