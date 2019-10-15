package Repository_package;

public abstract class Connection {
	public static byte[] getResource(String url) //(url:string)
	{
		byte[] tab = url.getBytes();
		return tab;
		
	}
}
