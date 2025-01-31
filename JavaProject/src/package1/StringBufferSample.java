package package1;

public class StringBufferSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer a=new StringBuffer("Hello");
		a.append(" World");                    //append method
		System.out.println(a);
		
		a.insert(6,"Good ");             //insert method
		System.out.println(a);
		
		a.replace(11,16,"nation");       //replace method
		System.out.println(a);
		
		a.delete(6,11);                      //delete method
		System.out.println(a);
		
		a.reverse();                   //reverse method
		System.out.println(a);

	}

}
