package Converter_package;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {
	
	
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
	
		//System.out.println("Hello");
		//Currency obj = new Currency("2", 1, "3", 2.5);
		//System.out.println(obj.getName());
		//Repository r = remoteRepository();
		
		//String url = "https://www.nbp.pl/kursy/xml/LastA.xml"
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
		
	}
}
