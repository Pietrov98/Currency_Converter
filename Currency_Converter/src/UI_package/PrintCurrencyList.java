package UI_package;

import java.util.List;

import Currency_package.Currency;
import Repository_package.Repository;

public abstract class PrintCurrencyList {

	public static void print(Repository r)
	{
		List<Currency> currencyList = r.getCurrencyList();
		for(int i = 0; i < currencyList.size(); i++) {
            System.out.println(currencyList.get(i).getName() + " <" + currencyList.get(i).getCode() + "> " + currencyList.get(i).getAverageRate());
        }
	}
}
