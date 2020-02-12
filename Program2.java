package object_type_casting_programs;

public class Program2
{
	public static void main(String[] args) 
	{
		A rv1 = (A) new B();
		rv1.move();
		B rv2 = (B) rv1;
		rv2.move();
	}
}
