package part02;
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
				"\n4: Edit supplier details" +
				"\n5: Edit product details" +
				"\n6: Make an order" +
				"\n7: Remove supplier (and all related products)" +
				"\n8: Remove product" +
				"\n9: Exit application";
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
			editSupDetails();
			break;
		case 5 :
			editProDetails();
			break;
		case 6 :
			//order();
			break;
		case 7 :
			//removeSup;
			break;
		case 8 :
			//removePro;
			break;
		case 9 :
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
	
	public static void chooseSupRegion()
	{
		int numOfRegions = EnumSet.allOf(SupRegion.class).size();
		int i = 1;
		printSupRegion(i, numOfRegions);
		System.out.println("Please type the number of your region: ");

		
		
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

	public static void editSupDetails()
	{
		System.out.println("----Edit a supplier----");
		printSuppliers();
		System.out.println("\nPlease enter the Supplier code for the Supplier you wish to change");
		int supCodeInput = sc.nextInt();
		System.out.println(supArray.get(supCodeInput-1).editSupDetails());
		System.out.println("\nPlease enter the detail you would like to change");
		int detailChange = sc.nextInt();
		switch(detailChange)
		{
		case 1: 
			System.out.println("Please enter the new name of the supplier: ");
			String newName = sc.nextLine();
			supArray.get(supCodeInput - 1).setSupName(newName);
		break;
		
		case 2: 
			Address newAddress = addAddress();
			supArray.get(supCodeInput - 1).setSupAddress(newAddress);
		break;
		
		case 3: 
			System.out.println("Please enter the new region of the supplier: ");
			chooseSupRegion();
			SupRegion region = SupRegion.values()[sc.nextInt()-1];
			supArray.get(supCodeInput - 1).setSupregion(region);
		break;
		
		case 4: 
			Menu();
		break;
		}
		
	}

	public static void editProDetails()
	{
		System.out.println("----Edit a product----");
		printSuppliers();
		System.out.println("Please enter Supplier Code of Product Supplier: ");
		int supplierCode = sc.nextInt();
		supArray.get(supplierCode).printProductList();
		System.out.println("Please enter the product code of the product you would like to edit: ");
		int productCode = sc.nextInt();
		System.out.println(supArray.get(supplierCode-1).getSupProduct().get(productCode-1).editProductDetails());
		System.out.println("\nPlease enter the detail you would like to change");
		int detailChange = sc.nextInt();
		switch(detailChange)
		{
		case 1: 
			System.out.println("Please enter the new make of the product: ");
			String newMake = sc.nextLine();
			supArray.get(supplierCode - 1).getSupProduct().get(productCode).setProMake(newMake);
		break;
		
		case 2: 
			System.out.println("Please enter the new model of the product: ");
			String newModel = sc.nextLine();
			supArray.get(supplierCode - 1).getSupProduct().get(productCode).setProModel(newModel);
		break;
		
		case 3: 
			System.out.println("Please enter the new price of the product: ");
			double newPrice = sc.nextDouble();
			supArray.get(supplierCode - 1).getSupProduct().get(productCode).setProPrice(newPrice);
		break;
		
		case 4: 
			System.out.println("Please enter the new amount of the product available: ");
			int newQtyAvailable = sc.nextInt();
			supArray.get(supplierCode - 1).getSupProduct().get(productCode).setProQtyAvailable(newQtyAvailable);
		break;
		case 5:
			System.out.println("Please enter wether the product is available(true/false): ");
			boolean newState = sc.nextBoolean();
			supArray.get(supplierCode - 1).getSupProduct().get(productCode).setProDiscontinued(newState);
		break;
		case 6:
			Menu();
		break;
		}
		

		
	}

	public static void order()
	{
		boolean complete = false;
		double totalPrice = 0;
		int numberOfItems = 0;
		ArrayList<Product> order = null;
		String printOrders = "";
		
		while(!complete)
		{
			printSuppliers();
			System.out.println("Please enter Supplier Code for the order you would like to make: ");
			int inputSupplierCode = sc.nextInt();
			System.out.println(supArray.get(inputSupplierCode).printProductList());
			System.out.println("Please enter the Product Code you would like to order: ");
			int inputProductCode = sc.nextInt();
			System.out.println("How many would you like to order? ");
			int quantity = sc.nextInt();
			double price = supArray.get(inputSupplierCode).getSupProduct().get(inputSupplierCode).getProPrice() * quantity;
			order.add(supArray.get(inputSupplierCode).getSupProduct().get(inputProductCode));
			totalPrice += price;
			numberOfItems ++;
			System.out.println("Is your order Complete?(true/false)");
			complete = sc.nextBoolean();
		}
		
		for(int i = 0; i < order.size(); i++)
		{
			printOrders += order.get(i).getProductDetails();
			printOrders += "\n";
		}

		System.out.println("Number of items:" + numberOfItems);
		System.out.println("----Products----" + "\n" + printOrders);
		System.out.println("Total Price: " + totalPrice);
		}
}
