package projecteuler.org;

public class LargestPalindromeProduct {
	public int getLargestPalinProduct()
	{
		int result = 1, product =1;
		StringBuilder sb = new StringBuilder();
		for(int i=99; i>=10; i--)
		{
			for(int j=i;j>=10; j-- )
			{
				product = i * j;
				sb = sb.append(product);
				if(sb.equals(sb.reverse()))
				{
					result = Math.max(result, product);
					return result;
				}
			}
		}
		return result;
	}

}
