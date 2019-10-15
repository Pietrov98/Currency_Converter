package DataProvider_package;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import Calculations_package.UserCalc;
import Currency_package.Currency;
import Repository_package.Connection;
import Repository_package.NBPConverter;
import Repository_package.ParseXml;
import Repository_package.Repository;
import UI_package.Menu;
import UI_package.PrintCurrencyList;

public class NBPDataProvider implements IDataProvider{

	public void RequireRemoteData() {
		byte[] tab = Connection.getResource("https://www.nbp.pl/kursy/xml/LastA.xml");
		File xmlFile = ParseXml.parse(tab);
		Repository r = new Repository();
		try 
		{
			r = NBPConverter.remoteRepository(tab, xmlFile);
		} catch (SAXException | IOException | ParserConfigurationException e) {
			e.printStackTrace();
		}
		
		while(true)
		{
			int choice = Menu.printMenu();
			if(choice == 3)
			{
				System.exit(0);
			}
			else if(choice == 2)
			{
				System.out.println("Podaj kod waluty, ktora chcesz sprawdzic");
				Scanner in = new Scanner(System.in);
				String code = in.next().toUpperCase();
				
				if(r.getValueByCode(code) != null)
				{
					Currency currency1 = r.getValueByCode(code);
					System.out.println("Kurs waluty: " + currency1.getName() + " <" + currency1.getCode() + "> wynosi "  + currency1.getAverageRate());
				}
			}
			else if(choice == 1)
			{
				PrintCurrencyList.print(r);
			}
			
			else if(choice == 0)
			{
				System.out.println("Podaj kod waluty, ktora zostanie wymieniona i walute, na ktora wymieniasz");
				Scanner in = new Scanner(System.in);
				String code1 = in.next().toUpperCase();
				String code2 = in.next().toUpperCase();
				UserCalc.uCalc(code1, code2, r);
			}
			else
			{
				System.out.println("Nie ma takiej opcji");
			}
		}
	

	}
	
}
