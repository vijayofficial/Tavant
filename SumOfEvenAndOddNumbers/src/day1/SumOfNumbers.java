package day1;

public class SumOfNumbers {

	public int sumOfEvenNum(int begin, int end)
	{
		int sum=0;
		if(begin%2==1)
			begin++;
		for(int i=begin;i<=end;i+=2)
			sum+=i;
		
		return sum;
	}
	
	public int sumOfOddNum(int begin, int end)
	{
		int sum=0;
		if(begin%2==0)
			begin++;
		
		for(int i=begin;i<=end;i+=2)
			sum+=i;
		
		return sum;
	}
}
