
public class LargestNumber {

	public static void main(String[] args) 
	{
		int[]numbersArray= new int [] {-1,34,57,89,69,72,-83};
		FindLargestNumbersUsingWhileLoop(numbersArray);
		LargestNumberUsingForLoops(numbersArray);
		
	}	


	public static void FindLargestNumbersUsingWhileLoop(int[] numbers )
	{
		if(numbers != null)
		{
			if (numbers.length >0)
			{
				int i=0;
				int largestNumber= numbers[0];
				while (i <numbers.length )
					{if (largestNumber< numbers[i])
					{ largestNumber= numbers[i];
					}
					i++;
					}
				
				System.out.println("Largest number using while loop is "+ largestNumber);
			}
		}
	}
	public static void LargestNumberUsingForLoops(int[]numbers){
		if(numbers !=null) {
			if(numbers.length>0){
				int i;
				int largestnumber=numbers[0];
				for(i = 1; i<numbers.length; i++){
					if(largestnumber<numbers[i]){
						largestnumber=numbers[i];
						
					}
					i++;
				}
				System.out.println("Largest number using for loop is "+ largestnumber);
			}
			
		}
	}
	
	}
	