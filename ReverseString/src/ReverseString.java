
public class ReverseString {

	public static void main(String[] args) 
	{
	ReverseOutOfPlace("cool whip");

	}

	public static void ReverseOutOfPlace(String string)
	{
		if( string!= null)
		{
			char[] originalStringCharacters= string.toCharArray();
			char[]reversedStringCharacters = new char[string.length()];
			for(int i =0,j= originalStringCharacters.length -1;i< reversedStringCharacters.length;i++,j--)
			{
				reversedStringCharacters[i]= originalStringCharacters[j];
			}
			String reversedString = new String (reversedStringCharacters);
			System.out.println ("The reversed string is "+ reversedString);
		}
	}
}
