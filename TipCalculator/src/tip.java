import java.util.Scanner;
public class tip {

	public static void main(String[] args) {
		
		
			System.out.println("Enter the amount for the check:");
			Scanner sc = new Scanner(System.in);
			double checkAmount = sc.nextDouble();
			
			double tip15 = 6.5980;
			System.out.format("The 15 percent tip for this check is %3.3f%n", tip15);
	}

}
