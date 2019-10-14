package Calculations_package;

import java.util.Scanner;

import Currency_package.Currency;

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
		System.out.println("Podaj kwote, ktora chcesz wymienic");
		Scanner in = new Scanner(System.in);
		double value = in.nextDouble();

		value = currency1.getAverageRate() * value * currency1.getConverter() / (currency2.getAverageRate() * currency2.getConverter());
		setValue(value);
		return this.value; //zwraca przeliczony wynik?
	}
}
