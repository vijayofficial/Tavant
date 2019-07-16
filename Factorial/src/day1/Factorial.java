package day1;

public class Factorial {
	public int calculateFactorial(int num)
	{
		int result=1;
		for(int i=num;i>1;i--)
			result*=i;
		return result;
	}
}
