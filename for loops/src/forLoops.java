
public class forLoops
	{

		public static void main(String[] args)
			{
				challengeOne();
				challengeTwo();
				challengeThree();
				ChallengeFour();
			}
		
		public static void challengeOne()
		{
			for (int i = 1; i < 6; i++)
				{
					System.out.println(i);
				}
		}
		
		public static void challengeTwo()
		{
			for (int i = 2; i < 10; i = i + 2) 
				{
					System.out.println(i + " I love Mullen");
				}		
		}
		
		public static void challengeThree()
		{
			for (int i = 1; i < 6; i++)
				{
					System.out.print(i);
				}
		}
		
		public static void challengeFour()
		{
			for (int i = 10; i > 10; i--)
				System.out.println(i);
		}
		
		
	}
