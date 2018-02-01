import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Matryoshka 
{
	private Matryoshka innerDoll;	// instance fields
	private String name;
	private Color hair;
	private boolean babushka;
	
	public Matryoshka(String name, Color hair, boolean babushka)		// constructor for a Matryoshka
	{
		this.innerDoll = null;
		this.name = name;
		this.hair = hair;
		this.babushka = babushka;
	}
	
	public Matryoshka(Matryoshka inner, String name, Color hair, boolean babushka)		// second constructor with an inner doll
	{
		this.innerDoll = inner;
		this.name = name;
		this.hair = hair;
		this.babushka = babushka;
	}
	
	// hasInnerDoll - returns true if this has an inner doll
	public boolean hasInnerDoll()
	{
		return this.innerDoll != null;
	}
	
	// getInnerDoll - accessor
	public Matryoshka getInnerDoll()
	{
		return this.innerDoll;
	}
	
	/** howManyDolls - return a count of how many dolls there are, including this one.
	 */
	public int howManyDolls()
	{
		if (this.innerDoll == null)
		{
			return 1;
		}
		return 1 + this.innerDoll.howManyDolls();
	}
	
	//Matryoshka lab part 1
	//DO PART 1 HERE
	public int howManyWearingBabushkas() {
	    if (this.innerDoll == null && babushka == true) {
	        return 1;
	    }
	    else if (this.innerDoll = null && babushka == false) {
	        return 0;
	    }
	    else if (this.innerDoll != null && babushka == true) {
	        return 1 + innerDoll.howManyWearingBabushkas();
	    }
	    else {
	        return 0 + innerDoll.howManyWearingBabushkas();
	    }
	}
	
	public int redHeadCount() {
		if(!hasInnerDoll && hair == Color.RED) {
			return 1;
		}
		else if (!hasInnerDoll && hair != Color.RED) {
			return 0;
		}
		else if (hair == Color.RED) {
			return 1 + innerDoll.redHeadCount();
		}
		else {
			return 0 + innerDoll.redHeadCount();
		}
	}
	
	public String lastName() {
	    if (hasInnerDoll() == false) {
	        return name;
	    }
	    String otherName = innerDoll.lastName()
	    if (name.compareTo(otherName) > 0) {
	        return name;
	    }
	    else {
	        return otherName;
	    }
	}
	
	
	
	public int whileHowManyDolls()
	{
		int howMany = 1;
		Matryoshka doll = this;
		while (doll.getInnerDoll() != null)
		{
			doll = doll.getInnerDoll();
			howMany++;
		}
		return howMany;
	}
	
	public int forHowManyDolls()
	{
		int howMany = 1;
		for(Matryoshka doll = this; doll.getInnerDoll() != null; 
										doll = doll.getInnerDoll())
		{
			howMany++;
		}
		return howMany;
	}
	
	
	public int countRecursive(Object[] a)
	{
		return crHelper(a, 0);
	}

	private int crHelper(Object[] a, int index) {
		if (index == a.length)
		{
			return 0;
		}
		if (a[index] == null)
		{
			return crHelper(a, index+1);
		}
		else
			return 1 + crHelper(a, index+1);
	}
	
	
	
    //Matryoshka lab part 2
	
	public static int recursiveDollCount(List<Matryoshka> dollList) {
		return rdcHelper(0, dollList);
	}
	
	public static int rdcHelper(int index, List<Matryoshka> list) {
		if (index >= list.size()) {
			return 0;
		}
		else {
			return list.get(index).howManyDolls() + rdcHelper(index + 1, list);
		}
	}
	
	public static int whileLoopDollCount(List<Matryoshka> dollList) {
		int count = 0;
		int index = 0;
		while (index < dollList.size()) {
			count += dollList.get(index).howManyDolls();
			index += 1;
		}
		return count;
	}
	
	public static int forLoopDollCount(List<Matryoshka> dollList) {
		int count = 0;
		for (int index = 0; index < dollList.size(), index += 1) {
			count += dollList.get(index).howManyDolls();
		}
		return count;
	}
	
	public static int forEachLoopDollCount(List<Matryoshka> dollList) {
		int count = 0;
		for (Matryoshka doll : dollList) {
			count += doll.howManyDolls();
		}
		return count;
	}
	
}