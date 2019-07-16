package day1;

import java.text.DecimalFormat;

public class Temperature {
	public Double convertToFarenheit(Double cel)
	{
		Double result=(cel*(9.0/5.0))+32;
		DecimalFormat dec=new DecimalFormat("#0.00");
		return Double.parseDouble(dec.format(result));
	}
	
	public Double convertToCelsius(Double Faren)
	{
		Double result=(Faren-32)*(5.0/9.0);
		DecimalFormat dec=new DecimalFormat("#0.00");
		return Double.parseDouble(dec.format(result));
	}
}
