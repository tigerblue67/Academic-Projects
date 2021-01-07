package part01;
import java.util.Scanner;
public class Menu {
Scanner sc = new Scanner(System.in);
private String choices;
public void Menu()
{
	choices += "----Please enter one of the following options----" + 
			"\n1: Print all products by supplier" + 
			"\n2: Add a new supplier" + 
			"\n3: Add a new product" +
			"\n4: Exit application";
	System.out.println(choices);
	int input = sc.nextInt();
	Validation intCheck = new Validation(input, 4);
	intCheck.Validate();
	switch(input)
	{
	case 1 :
		printProductList();
		break;
	case 2 :
		addSupplier();
		break;
	case 3 : 
		addProduct();
		break;
	case 4 :
		System.exit(0);
		break;
		
	}
	sc.close();
}



}
