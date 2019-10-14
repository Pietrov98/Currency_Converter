package Converter_package;

import java.util.List;

public class Repository {
	private List<Currency> currencyList;

	public List<Currency> getCurrencyList() 
	{
		return currencyList;
	}
	
	public void seetCurrencyList(List<Currency> currencyList) 
	{
		this.currencyList = currencyList;
	}

	public Currency getValueByCode(String code) // raczej ma byc (String code), ale na tablicy bylo Currency obj
	{
		for(int i = 0; i < getCurrencyList().size(); i++)
		{
			if(getCurrencyList().get(i).getCode().compareTo(code) == 0)
			{
				return getCurrencyList().get(i);
			}
		}
		System.out.println("Brak podanej waluty");
		return null;//zwraca znaleziony obiekt, na podstawie kodu
		
	}
	
}
