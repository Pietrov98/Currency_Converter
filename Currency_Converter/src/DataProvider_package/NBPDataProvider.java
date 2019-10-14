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
		byte[] url = Connection.getResource();
		File xmlFile = ParseXml.parse();
		Repository r = new Repository();
		try 
		{
			r = NBPConverter.remoteRepository(xmlFile);
		} catch (SAXException | IOException | ParserConfigurationException e) {
			e.printStackTrace();
		}
		
		while(true)
		{
			int choice = Menu.printMenu();
			//System.out.println(choice);
			if(choice == 3)
			{
				System.exit(0);
			}
			//Repository r = NBPConverter.remoteRepository();
			if(choice == 2)
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
			if(choice == 1)
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
		}
	

	}
	
}
