package Converter_package;

import java.util.Scanner;

public abstract class UserCalc {
	public static void uCalc(String c1, String c2, Repository r)
	{
		Currency currency1 = null, currency2 = null;
		currency1 = r.getValueByCode(c1);
		currency2 = r.getValueByCode(c2);
		if(currency1 == null || currency2 == null)
			System.out.println("Brak wskazanej waluty");
		else
		{
			Calculate obj = new Calculate(currency1, currency2);
			double value = obj.calc(currency1, currency2);
			System.out.println(value + " " + currency2.getCode());
		}
	}
	
	public static void printArgs(Repository r)
	{
		
	}
}
