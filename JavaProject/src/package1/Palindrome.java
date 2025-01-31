package package1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//CHECK WHETHER THE GIVEN NUMBER IS PALINDROME OR NOT
		Palindrome newobj=new Palindrome();
		int rev = newobj.Reverse(121);
		newobj.Check(121,rev);
	}
	public int Reverse(int i)
	{
	int reverse=0;
	int remainder=0;
	
	while(i!=0)
	{
	remainder=i%10;
	reverse=reverse*10+remainder;
	i=i/10;
	}
	return reverse;
	}
	
	
	public void Check(int i,int reverse)
	{
	if(i==reverse)
	{
	System.out.println(i+" is palindrome");
	}
	else
	{
	System.out.println(i+" is not a palindrome");	
	}
	}
}
