package package1;

public class MethodParameterReturnvalue {

	//find the square of a number
	//find the cube of a number
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int square = findsquare(6);
		System.out.println(square);
		
		int cube=findcube(2);
		System.out.println(cube);
	}
	
static int findsquare(int a)
{
int b=a*a;
return b;
}

static int findcube(int a)
{
	int c=a*a*a;
	return c;
}
}
