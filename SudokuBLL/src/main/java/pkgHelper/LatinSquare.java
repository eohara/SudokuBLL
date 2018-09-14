package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	private int[][] myLatinSquare;

	public LatinSquare()
	{
		
		
	}
	public LatinSquare(int[][] latinSquare) {
		super();
		myLatinSquare = latinSquare;
	}
	public int[][] getLatinSquare() {
		return myLatinSquare;
	}
	public void setLatinSquare(int[][] latinSquare) {
		myLatinSquare = latinSquare;
	}
	
	public boolean hasDuplicates(int [] arr)
	{
		boolean hasDuplicates = false;
		
		if (arr == null)
			return false;
		
		Arrays.sort(arr);
		
		
		for (int i = 0; i < arr.length-1; i++ )
		{
			if (arr[i] == arr[i+1])
			{
				hasDuplicates = true;
				break;
			}
		}
		
		
		return hasDuplicates;
		
	}
	
	public boolean doesElementExist(int[] arr, int iValue)
	{
		boolean doesElementExist = false;
		
		if (arr == null)
			return false;
		
		for (int i: arr) {
			if (i == iValue) {
				doesElementExist = true;
				break;
			}
		}
		
		return doesElementExist;
		
	}
	public boolean ContainsZero()
	{
		for (int iCol = 0; iCol < myLatinSquare.length; iCol++)
		{
			for (int iRow = 0; iRow < myLatinSquare.length; iRow++)
			{
				if (myLatinSquare[iCol][iRow] == 0)
				{
					return true;
				}
			}
		}
		
		return false;
	}
	
	public int[] getColumn(int iCol)
	{
				
		int[] intColumn = new int[myLatinSquare.length];
		
		for (int iColumn = 0; iColumn < myLatinSquare.length; iColumn++) 
		{
			intColumn[iColumn] = myLatinSquare[iColumn][iCol];
		}
				
		return intColumn;
		
	}
	
	public int[] getRow(int iRow)
	{
				
		int[] intRow = new int[myLatinSquare.length];
		
		for (int iRows = 0; iRows < myLatinSquare.length; iRows++) 
		{
			intRow [iRows] = myLatinSquare[iRow][iRows];
		}
				
		return intRow;
	}
	
	public boolean hasAllValues(int[] arr1, int[] arr2)
	{
		
		
		if (arr1 ==null)
	    {
	        return false;
	    }
	        
	    if (arr2 ==null)
		    {
		      return false;
		      
		    }
	    
	    Arrays.sort(arr1);
		Arrays.sort(arr2);
		
	    for (int i=0; i<arr1.length; i++)
	    {
	    	if (arr1[i] != arr2[i])
	    
	            {
	                return false;
	            }
	        }
	    
	    return true; 
	}
	
	public boolean isLatinSquare()
	{
		
		boolean a = true; //return true by default
		
		int[] arr = getRow(0);
		
		if (hasDuplicates(arr)==true)
		{
			a = false;
		}
		
		for (int iRow = 0;iRow < myLatinSquare.length;iRow++)
		{
			if (hasAllValues(getRow(iRow), arr) == false)
			//checks all rows of 'myLatinSquare' 
			{
				a = false;
				break;
		
			}
			
		}
		
		for (int iCol = 0; iCol < myLatinSquare.length;iCol++)
		{
			if (hasAllValues(getColumn(iCol),arr)==false)
			{
				a = false;
				break;
			}
			
		}
		
		if (ContainsZero() == true)
		{
			a = false;
		}
	
		return a;
		
	}

}


