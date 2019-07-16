package day1;

public class MarkValidation {	
		public boolean isPass(int marks)
		{
			if(marks>=40)
				return true;
			else
				return false;
		}
		
		public String Grade(int mark)
		{
			char a;
			if(mark>90 && mark<=100)
				a='A';
			else if(mark>75 && mark<89)
				a='B';
			else if(mark>60 && mark<74)
				a='C';
			else
				a='D';
		
		
			switch(a)
			{
				case 'A':
						return "Grade A";
						
				case 'B':
					return "Grade B";
					
				
				case 'C':
					return "Grade C";
					
				
				default:
					return "Grade D";
					
			}
			
		}
		
}	


