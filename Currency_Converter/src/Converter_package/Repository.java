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

	public String getValueByCode(Currency obj)
	{
		
		return null;//zwraca znaleziony obiekt, na podstawie kodu
		
	}
	
}
