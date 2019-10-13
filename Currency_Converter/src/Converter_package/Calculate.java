package Converter_package;

public class Calculate {
	private Currency currency1;
	private Currency currency2;
	private double value;
	
	public Calculate(Currency currency1, Currency currency2)
	{
		this.currency1 = currency1;
		this.currency2 = currency2;
	}
	
	public void setValue(double value)
	{
		this.value = value;
	}

	public double calc(Currency currency1, Currency currency2)
	{
		return 0; //zwraca przeliczony wynik?
	}
}
