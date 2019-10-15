package Repository_package;

import java.io.File;

public abstract class ParseXml {
	public static File parse(byte[] tab) //(byte[] tab)
	{
		File xmlFile = new File("src/Repository_package/LastA.xml");
		String url = new String(tab);
		//tutaj powinien byc pobierany xml i zapisywany do pliku
		return xmlFile;
	}
}
