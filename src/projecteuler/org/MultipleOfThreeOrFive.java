package projecteuler.org;

public class MultipleOfThreeOrFive {
	public int getSumOfAllMultiplesBelow(int num)
	{
		int sum = 0;
		for(int i=1; i<num; i++)
		{
			if(i%3 == 0 | i%5 == 0)
			{
				sum += i;
			}
		}
		
		return sum;
	}

}
