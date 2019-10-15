package Repository_package;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import Currency_package.Currency;

public abstract class NBPConverter {
	
	public static Repository remoteRepository(byte[] tab, File xmlFile) throws SAXException, IOException, ParserConfigurationException //jeszcze ma przyjac byte
	{
		List<Currency> currencyList = new ArrayList<Currency>();
		currencyList.add(new Currency("zloty polski", 1, "PLN", 1));
		URL url = new URL ("https://www.nbp.pl/kursy/xml/LastA.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(url.openStream());
	   /*DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document = documentBuilder.parse(xmlFile);*/
		NodeList list = document.getElementsByTagName("pozycja");
		for(int i = 0; i < list.getLength(); i++)
		{
			Node node = list.item(i);
			if(node.getNodeType() == Node.ELEMENT_NODE)
			{
				Element element = (Element) node;
				String name = element.getElementsByTagName("nazwa_waluty").item(0).getTextContent();
				int converter = Integer.parseInt(element.getElementsByTagName("przelicznik").item(0).getTextContent());
				String code = element.getElementsByTagName("kod_waluty").item(0).getTextContent();
				double average_course = Double.parseDouble(element.getElementsByTagName("kurs_sredni").item(0).getTextContent().replace(",", "."));
				currencyList.add(new Currency(name, converter, code, average_course));

			}
		}
		Repository rep = new Repository();
		
		rep.seetCurrencyList(currencyList);
		return rep; //zwraca objekt Repository

	}
}
