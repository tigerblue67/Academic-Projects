package model;

import java.io.File;
import java.util.ArrayList;

public class OutfitSubmission extends SmartSerializable
{
	private static final long serialVersionUID = 1L;
	public String uniqueID;
	public String title;
	public String description;
	public String picture;
	public ArrayList<Components> outfitComponents = new ArrayList<Components>();
	
	public void addCmpToArrayList(Components cmp) {
		outfitComponents.add(cmp);
	}
}
