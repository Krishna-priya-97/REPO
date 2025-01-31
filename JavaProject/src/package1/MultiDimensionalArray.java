package package1;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print all elements in an array
		
		//int matrics[][]=new int[2][2];       //datatype arrayname[][]=new datatype[][];-assign the size of an array-array instantiation
		int matrics[][]= {{1,2,3},{4,5,6}};    //datatype arrayname[][]={{row 1 elements seperated by commas},{row 2 elements seperated by commas}};-array initialization
		
			for(int i=0;i<=matrics.length;i++)
			{
				for(int j=0;j<=matrics.length;j++)
				{
			     System.out.print(matrics[i][j]+"\t ");               //    "\t"-tab space generated in between the elements
			    }
				System.out.println();                                    // second row printed in new line
			}
		}
	
}
