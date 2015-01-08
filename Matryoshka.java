import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Matryoshka 
{
	private Matryoshka innerDoll;	// instance fields
	
	public Matryoshka()		// constructor for a Matryoshka
	{
		this.innerDoll = null;
	}
	
	public Matryoshka(Matryoshka inner)		// second constructor with an inner doll
	{
		this.innerDoll = inner;
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
		
	}
	
	public static int rdcHelper(int index, List<Matryoshka> list) {
		
	}
	
	public static int whileLoopDollCount(List<Matryoshka> dollList) {
		
	}
	
	public static int forLoopDollCount(List<Matryoshka> dollList) {
		
	}
	
	public static int forEachLoopDollCount(List<Matryoshka> dollList) {
		
	}
	
}
