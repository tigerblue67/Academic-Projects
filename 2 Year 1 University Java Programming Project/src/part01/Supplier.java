package part01;

import java.util.ArrayList;

public class Supplier {
	private int supCode;
	private String supName;
	private Address supAddress;
	private SupRegion supregion;
	private ArrayList<Product> supProduct;
	
	public Supplier(int supCode, String supName, Address supAddress, SupRegion supregion,
			ArrayList<Product> supProduct) 
	{
		
		this.supCode = supCode;
		this.supName = supName;
		this.supAddress = supAddress;
		this.supregion = supregion;
		this.supProduct = supProduct;		
	}
	
	public String getSupplierDetails()
	{
		String supDetails = "";
		supDetails += "----Supplier Details----";
		supDetails += "\nSupplier Code: " + this.supCode;
		supDetails += "\nSupplier Name: " + this.supName;
		supDetails += "\nSupplier Address: " + this.supAddress.getFullAddress();
		supDetails += "\nSupplier Region: " + this.supregion.getRegionAsString();
		supDetails += "\nSupplier Products: \n" + printProductList();
		return supDetails;
	}
	

	
	public String printProductList()
	{
		String products = "";
		for (int i = 0; i<supProduct.size(); i++)
		{
			
			 products += supProduct.get(i).getProductDetails();
		}
		return products;
	}
	
	public String getSupName() 
	{
		return supName;
	}
	
	public void setSupName(String supName) 
	{
		this.supName = supName;
	}
	
	public Address getSupAddress() 
	{
		return supAddress;
	}
	
	public void setSupAddress(Address supAddress) 
	{
		this.supAddress = supAddress;
	}
	
	public SupRegion getSupregion() 
	{
		return supregion;
	}
	
	public void setSupregion(SupRegion supregion) 
	{
		this.supregion = supregion;
	}
	
	public ArrayList<Product> getSupProduct()
	{
		return supProduct;
	}
	
	public void setSupProduct(ArrayList<Product> supProduct) 
	{
		this.supProduct = supProduct;
	}
	
	public int getSupCode() 
	{
		return supCode;
	}
	
	
	
}
