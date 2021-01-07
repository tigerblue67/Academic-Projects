package part01;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Scanner;

public class Part01Tester {

	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Supplier> supArray = new ArrayList<Supplier>();
	public static void main(String[] args) 
	{
		Product testProduct = new Product(proCodeGen(), "Dell", "Inspiron", 550.60, 600, false);
		Address dellAddress = new Address(25, "lansdowne park", "Belfast", "BT154AF", "Ireland");
		ArrayList<Product> dellProducts = new ArrayList<Product>();
		Supplier testSupplier = new Supplier(supCodeGen(), "Dell Industries", dellAddress, SupRegion.OUTSIDE_EU, dellProducts);
		
		dellProducts.add(testProduct);
		
		supArray.add(testSupplier);
		Menu();
	}
	private static int supCode = 0;
	private static int proCode = 0;
	public static int supCodeGen()
	{
		supCode++;
		return supCode;
	}
	public static int proCodeGen()
	{
		proCode++;
		return proCode;
		
	}
	private static String choices = "";
	public static void Menu()
	{
		boolean exit = false;
		while(!exit)
		{
		choices += "\n----Please enter one of the following options----" + 
				"\n1: Print all products by supplier" + 
				"\n2: Add a new supplier" + 
				"\n3: Add a new product" +
				"\n4: Exit application";
		System.out.println(choices);
		int input = sc.nextInt();
		if(!(input == (int)input))
		{
			System.out.println("please enter an integer");
			Menu();
		}
		Validation intCheck = new Validation(input, 4);
		intCheck.Validate();
		switch(input)
		{
		case 1 :
			System.out.println(printProductList());
			//Menu();
			break;
		case 2 :
			addSupplier();
			//Menu();
			
			break;
		case 3 : 
			addProduct();
			//Menu();
			break;
		case 4 :
			exit = true;
			break;
			
		}
		if(exit)
		{
			System.exit(0);
		}
		}
		
	}
	public static String printProductList()
	{
		String productList = "";
		for(int i = 0; i < supArray.size(); i++)
		{
			productList += "----Supplier----";
			productList += "\n";	
			productList += supArray.get(i).getSupName();
			productList += "\n";
			productList += supArray.get(i).printProductList();
			
		}
		return productList;
	}

	public static Supplier addSupplier()
	{
		System.out.println("----Add a new Supplier----");
		System.out.println("Please enter supplier name: ");
		String name = sc.nextLine();
		sc.next();
		Address supAddress = addAddress();
		int numOfRegions = EnumSet.allOf(SupRegion.class).size();
		int i = 1;
		printSupRegion(i, numOfRegions);
		System.out.println("Please type the number of your region: ");
		SupRegion region = SupRegion.values()[sc.nextInt()-1];
		ArrayList<Product> products = new ArrayList<Product>();
		Supplier newSupplier = new Supplier(supCodeGen(), name, supAddress, region, products);
		System.out.println(newSupplier.getSupplierDetails());
		return newSupplier;		
	}
	
	public static Address addAddress()
	{
		System.out.println("---- Address Details ----");
		System.out.println("Please enter street number: ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter street name: ");
		String name = sc.nextLine();
		System.out.println("Please enter town:");
		String town = sc.nextLine();
		System.out.println("Please enter postcode: ");
		String postcode = sc.nextLine();
		System.out.println("Please enter country: ");
		String country = sc.nextLine();
		Address newAddress = new Address(num, name, town, postcode, country);
		return newAddress;
				
		
		
	}
	
	public static void printSupRegion(int i, int numOfRegions)
	{
		while(i <= numOfRegions)
		{    
			System.out.println(i + ": " + SupRegion.values()[i-1].getRegionAsString());
			i++;    			
		} 
	}
	
	public static void printSuppliers()
	{
		for(int i = 0; i < supArray.size(); i++)
		{
			System.out.println(supArray.get(i).getSupplierDetails());
		}
	}
	
	public static Product addProduct()
	{
		System.out.println("----Add Product----");
		printSuppliers();
		System.out.println("Please enter Supplier Code of Product Supplier: ");
		int supCode = sc.nextInt();
		System.out.println("Please enter product make: ");
		String make = sc.nextLine();
		sc.next();
		System.out.println("Please enter the product model: ");
		String model = sc.nextLine();
		sc.next();
		System.out.println("Please enter product price in sterling: ");
		double price = sc.nextDouble();
		System.out.println("Please enter the number of the product available: ");
		int available = sc.nextInt();
		Product newProduct = new Product(proCodeGen(), make, model, price, available, false);
		for(int i = 0; i < supArray.size(); i++)
		{
			if(supCode == supArray.get(i).getSupCode())
			{
				supArray.get(i).getSupProduct().add(newProduct);
			}
		}
		System.out.println(newProduct.getProductDetails());
		return newProduct;
	}
}
