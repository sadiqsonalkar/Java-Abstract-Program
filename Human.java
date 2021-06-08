import java.util.*;
abstract class Human

	{
		abstract void Human();
	}
	
	class child extends Human
	{
		void Human()
		{
			System.out.println("Human : Child");
		}
	}
	
	class Teenage extends Human
	{
		void Human()
		{
			System.out.println("Human : Teenage");
		}
	}
	
	class adult extends Human
	{
		void Human()
		{
			System.out.println("Human : Adult");
		}
	}
	
	class TestHuman
	{
		public static void main(String args[])
		{
			adult a=new adult();
			a.Human();
			Teenage b=new Teenage();
			b.Human();
			child c=new child();
			c.Human();
		}
	}