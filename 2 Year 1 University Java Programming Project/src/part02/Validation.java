package part02;

public class Validation {

	private int userInput;
	private int numOfChoices;
	
	public Validation(int input, int num)
	{
		userInput = input;
		numOfChoices = num;
	}
	public String Validate() {
		String error = null;
		boolean found = false;
		for(int i = 1; i <= numOfChoices; i++)
		{
			
			if(userInput == i)
			{
				found = true;
				break;
				
			}
			
		}
		
		if(found) 
		{
			error = "";
		}
		else
		{
			error = "Please enter a number between 1 and " + numOfChoices;
		}
		return error;
	}
	
		


}
