package encap2;

public class Watch
{
	private int hour;
	private int min;
	private int sec;
	public Watch(int hour, int min, int sec)
	{
		if ((hour>=0 && hour<=23) && (min>=0 && min<=59) && (sec>=0 && sec<=59))
		{
			this.hour = hour;
			this.min = min;
			this.sec = sec;
		}
		else
		{
			System.err.println("Invalid Time............");
		}
	}
	public void Time()
	{
		System.out.println("Time: "+this.hour+" : "+this.min+" : "+this.sec);
	}
	public int getHour()
	{
			return this.hour;
	}
	public int getMin()
	{
			return this.min;
	}
	public int getSec()
	{
			return this.sec;
	}
	public void setHour(int hour)
	{
		if (hour>=0 && hour<=23)
		{
			this.hour = hour;
		}
		else
		{
			System.err.println("Inavlid Hour.......");
		}
	}
	public void setMin(int min)
	{
		if (min>=0 && min<=59)
		{
			this.min = min;
		}
		else
		{
			System.err.println("Inavlid Minute...");
		}
	}
	public void setSec(int sec)
	{
		if (sec>=0 && sec<=59)
		{
			this.sec = sec;
		}
		else
		{
			System.err.println("Invalid Second...........");
		}
	}
}
