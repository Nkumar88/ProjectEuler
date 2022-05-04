package projecteuler.org;

public class LargestPrimeFactor {
	public long getLargestPrimeFactor(long num)
	{
		long largeFactor = 1;
		
		long c = 2;
		while(num > 1)
		{
			if(num%c == 0)
			{
				largeFactor = Math.max(largeFactor, c);
				num = num/c;
			}
			else
			{
				c++;
			}
		}
		
		return largeFactor;
	}

}
