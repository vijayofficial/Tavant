package day1;

public class MarkValidation {
	public boolean isPass(int mark)
	{
		if(mark>=40)
			return true;
		else
			return false;
	}
	
	public String Grade(int mark)
	{
		if(mark>90)
			return "Grade A";
		else if(mark>75 && mark<89)
			return "Grade B";
		else if(mark>60 && mark<74)
			return "Grade C";
		else
		return "Grade D";
	}
	
}
