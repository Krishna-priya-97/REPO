package package1;

public class InstanceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceMethod newobj=new InstanceMethod();
		int d=newobj.sum(10,20);
		System.out.println(d);


	}

	public int sum(int a,int b)
	{

		int c=a+b;
		return c;
	}
}
