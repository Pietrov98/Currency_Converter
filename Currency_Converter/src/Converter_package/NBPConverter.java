package Converter_package;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public abstract class NBPConverter {
	public static Repository remoteRepository() throws SAXException, IOException, ParserConfigurationException
	{
		
		  
		return new Repository(); //zwraca objekt Repository

	}
}
