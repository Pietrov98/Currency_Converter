package Converter_package;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class Main {
	
	
	
	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException{
	
		//System.out.println("Hello");
		//Currency obj = new Currency("2", 1, "3", 2.5);
		//System.out.println(obj.getName());
		//String url = "https://www.nbp.pl/kursy/xml/LastA.xml"
		while(true)
		{
			int choice = Menu.printMenu();
			System.out.println(choice);
			if(choice == 2)
			{
				System.exit(0);
			}
			Repository r = NBPConverter.remoteRepository();
			if(choice == 1)
			{
				PrintCurrencyList.print(r);
			}
		}
		
		
	}
}
