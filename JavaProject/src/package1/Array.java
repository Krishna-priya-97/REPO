package package1;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//program to find the sum of elements in an array
		
		//  int number[]=new int[5];            //datatype arrayname[]=new datatype[];-assign the size of an array-array instantiation
		  int number[]={1,2,3,4,5};             //datatype arrayname[]={elements1,elements2,..};assign the values on an array-array initialization
		  int sum=0;
		  for(int i=0;i<number.length;i++)
		  {
			    
					  sum=sum+number[i];
			  
		  }
		  System.out.println(sum);
	}

}
