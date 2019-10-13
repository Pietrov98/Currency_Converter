package Converter_package;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Repository {
	private List<Currency> currencyList;

	public List<Currency> getCurrencyList() 
	{
		return currencyList;
	}

	public String getValueByCode(Currency obj) throws ParserConfigurationException, SAXException, IOException
	{
		File xmlFIle = new File("src/Converter_package/LastA.xml");
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document = documentBuilder.parse(xmlFIle);
		NodeList list = document.getElementsByTagName("pozycja");
		for(int i = 0; i < list.getLength(); i++)
		{
			Node node = list.item(i);
			if(node.getNodeType() == Node.ELEMENT_NODE)
			{
				Element element = (Element) node;
				System.out.println("id " + element.getElementsByTagName("nazwa_waluty").item(0).getTextContent());
				System.out.println("kod " + element.getElementsByTagName("kod_waluty").item(0).getTextContent());
				System.out.println("prz " + element.getElementsByTagName("przelicznik").item(0).getTextContent());
				System.out.println("kurs " + element.getElementsByTagName("kurs_sredni").item(0).getTextContent());

			}
		}
		return null;//zwraca znaleziony obiekt, na podstawie kodu
		
	}
	
}