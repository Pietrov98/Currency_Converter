package Converter_package;

public class Currency {
	private String name;
	private int converter;
	private String code;
	private double averageRate;

	public Currency(String name, int converter, String code, double averageRate)
	{
		this.name = name;
		this.converter = converter;
		this.code = code;
		this.averageRate = averageRate;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public int getConverter() 
	{
		return converter;
	}

	public void setConverter(int converter) 
	{
		this.converter = converter;
	}

	public double getAverageRate() 
	{
		return averageRate;
	}

	public void setAverageRate(double averageRate)
	{
		this.averageRate = averageRate;
	}

	public String getCode() 
	{
		return code;
	}

	public void setCode(String code) 
	{
		this.code = code;
	}
	
	
	
}
