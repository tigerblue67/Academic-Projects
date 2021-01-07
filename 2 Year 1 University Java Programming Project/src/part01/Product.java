package part01;

public class Product {
	
	private int proCode;
	private String proMake;
	private String proModel;
	private double proPrice;
	private int proQtyAvailable;
	private boolean proDiscontinued;
	
	public int getProCode() 
	{
		return proCode;
	}
	
	public void setProCode(int proCode) 
	{
		this.proCode = proCode;
	}
	
	public String getProMake() 
	{
		return proMake;
	}
	
	public void setProMake(String proMake) 
	{
		this.proMake = proMake;
	}
	
	public String getProModel() 
	{
		return proModel;
	}
	
	public void setProModel(String proModel) 
	{
		this.proModel = proModel;
	}
	
	public double getProPrice() 
	{
		return proPrice;
	}
	
	public void setProPrice(double proPrice) 
	{
		this.proPrice = proPrice;
	}
	
	public int getProQtyAvailable() 
	{
		return proQtyAvailable;
	}
	
	public void setProQtyAvailable(int proQtyAvailable) 
	{
		this.proQtyAvailable = proQtyAvailable;
	}
	
	public boolean isProDiscontinued() 
	{
		return proDiscontinued;
	}
	
	public void setProDiscontinued(boolean proDiscontinued) 
	{
		this.proDiscontinued = proDiscontinued;
	}
	
	public String getProductDetails()
	{
		String returnString = "";
		returnString += "---- Product Details ----";
		returnString += "\nProduct Code: " + this.proCode;
		returnString += "\nProduct Make: " + this.proMake;
		returnString += "\nProduct Model: " + this.proModel;
		returnString += "\nProduct Price: " + this.proPrice;
		returnString += "\nQuantity of product available: " + this.proQtyAvailable;
		returnString += "\nProduct Discontinued: " + this.proDiscontinued;
		return returnString;
	}
	
	public Product(int proCode, String proMake, String proModel, double proPrice, int proQtyAvailable,
			boolean proDiscontinued) {
		this.proCode = proCode;
		this.proMake = proMake;
		this.proModel = proModel;
		this.proPrice = proPrice;
		this.proQtyAvailable = proQtyAvailable;
		this.proDiscontinued = proDiscontinued;
	}

}
