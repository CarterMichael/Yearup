
public class Looplab2 {

	public static void main(String[] args) 
	{
	int[]array1= new int[] {40,60,80,100};
	int[]array2= new int[] {40,80,100};
	int[]array3= new int[] {40,60,80,100,60};
	System.out.println("Searching in array1.....");
	FindANumberinArray(array1,60);
	System.out.println("Searching in array2.....");
	FindANumberinArray(array2,60);
	
	System.out.println("finding all occurences in array 2....");
	FindOccurencesofNumberInArray(array2,60);
	System.out.println("finding all occurences in array 3....");
	FindOccurencesofNumberInArray(array3,60);
	}
public static void FindANumberinArray(int[]numbers,int searchNumber)
{if(numbers !=null)
{
	int foundAtLocation =-1;
	
	for(int i=0; i <numbers.length; i++)
	{
		if (numbers[i] == searchNumber)
		{
			foundAtLocation = i;
			break;
		}
			
	}
	if (foundAtLocation>=0)
		{
	System.out.println("The number was found at location "+ foundAtLocation);
		}
		else
		{
			System.out.println("The number that was found was not found in the array ");
		}
}

}
public static void FindOccurencesofNumberInArray(int[]numbers,int searchNumber)
{if(numbers !=null)
{
	int countOfOccurrences = 0;
	
	for(int i=0; i <numbers.length; i++)
	{
		if (numbers[i] == searchNumber)
		{
			countOfOccurrences++;
			
				}
			}
	System.out.println(searchNumber +" was found " + countOfOccurrences + " times in array ");
}

}

}
