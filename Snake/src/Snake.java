import java.io.FileNotFoundException;
import java.io.FileReader;

public class Snake {
	public static void main ( String []args )
	{
		System.out.println("Snake");
		try {
			FileReader fileReader = new FileReader("C:\\Users\\mcarter\\Documents\\OOp_week15.txt");
			String fileContents="";
			int i;
			while((i=fileReader.read())!=-1)
			{
				char ch=(char)i;
				fileContents = fileContents+ch;
			}
			fileReader();
			System.out.println(fileContents);
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found ");
			e.printStackTrace();
			
		}
	}
}
