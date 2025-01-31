package package1;

public class ThisKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ThisKeyWord var=new ThisKeyWord();
	var.instance();
	//var.instance(5);
	
	}
		 
	public void instance()
		{
			this.instance1(3);
			System.out.println("This");
		}
	
	public void instance1(int a)
	{
		System.out.println(a);
	}
	}

