package projecteuler.org;

public class EvenFibonacciNumbers {
	public long getSumOfEvenTerms()
	{
		long num1 = 1, num2 =2, tempSum=0;
		long sum = 0;
		final int MAX_TERM = 4000000;
		//System.out.print(num1 + " "+num2+" ");
		while(sum <= MAX_TERM)
		{
			if(num1%2 == 0)
			{
				sum = sum + num1;
				//System.out.print(sum+" ");
			}
			if(num2 > MAX_TERM) break;
			
			tempSum = num1 + num2;
			num1 = num2;
			num2 = tempSum;
		}
		return sum;
	}

}
