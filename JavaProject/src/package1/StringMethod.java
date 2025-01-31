package package1;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="Krishnapriya Karimbil";
int size=a.length();          //find length of string
System.out.println(size);

char get=a.charAt(4);   //find a char from string
System.out.println(get);
	
int b=52;
String c=String.valueOf(b);   //convert int datatype to string
System.out.println(c);

	String d="Hai";
	String e="Hai";
	String f="hai";
	
	System.out.println(d.equals(e));    //check strings(both content and spacing) equal or not
	System.out.println(d.equals(f));
	
	System.out.println(d.equalsIgnoreCase(f));  //check the string content only
	
	String g="Hello";
	String h=g.concat(" World");
	String i=h.concat(" Welcome");    //concat method-to add two string
	System.out.println(i);
	
	                   
	String array[]=a.split(" ");      //split method
	for(int j=0;j<array.length;j++)
	{
		System.out.println(array[j]);
	}
	//System.out.println(array[1]);   //split single term
	
	String l[]= {"ab","cd","ef"};      //for each loop
	for(String m:l)
	{
		System.out.println(m);
	}
	
	int n[]= {1,2,3};
	for(int m:n)
	{
		System.out.println(m);
	}
	}
	
	

}
