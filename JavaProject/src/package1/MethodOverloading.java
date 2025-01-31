package package1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int sum1=findsum(10,20);
        System.out.println(sum1);
        
        int sum2=findsum(10,20,30);
        System.out.println(sum2);	
        
        float sum3=findsum(10.24f,20.04f);
        System.out.println(sum3);
	}
static int findsum(int a,int b)
{
	int c=a+b;
	return c;
}

static int findsum(int f,int e,int d)
{
	int g=f+e+d;
	return g;
}

static float findsum(float h,float i)
{
	float k=h+i;
	return k;
}
}
