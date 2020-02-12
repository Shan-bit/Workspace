package encap2;

public class FastrackShowroom
{
	public static void main(String[] args)
	{
		Watch r1 = new Watch(15, 42, 45);
		r1.Time();
		r1.setMin(48);
		System.out.println("Changed Time.........");
		r1.Time();
	}
}
