package package1;

public class ThisInstance {

	int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisInstance var=new ThisInstance(2);
	var.instance();
	}
	
public void instance()
{
System.out.println(a);	
}

public ThisInstance(int a)
{
this.a=a;	
}

}
