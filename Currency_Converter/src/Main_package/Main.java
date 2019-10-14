package Main_package;

import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import DataProvider_package.NBPDataProvider;

public class Main {
	
	
	
	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException{
	
		//System.out.println("Hello");
		//Currency obj = new Currency("2", 1, "3", 2.5);
		//System.out.println(obj.getName());
		//String url = "https://www.nbp.pl/kursy/xml/LastA.xml"
		/*while(true)
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
		}*/
		NBPDataProvider dataProvider = new NBPDataProvider();
		dataProvider.RequireRemoteData();
		
	}
}
