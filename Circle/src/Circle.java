
public class Circle { 
	String m_color = null;
	double m_radius = -1; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle bigCircle = new Circle (90);
		System.out.println(" Big circles radius is "+ bigCircle.m_radius);
		System.out.println(" Big circles color is "+ bigCircle.m_color);
		System.out.println(" Big circles area is "+ bigCircle.CalculateArea());
		bigCircle.PrintColor();
		{
		Circle smallCircle =new Circle(3, "pink");
		System.out.println(" Small circles radius is "+ smallCircle.m_radius);
		System.out.println(" Small circles color is "+ smallCircle.m_color);
		System.out.println(" Small circles area is "+ smallCircle.CalculateArea());
		smallCircle.PrintColor();
		}
	}
   Circle(int radius)
   {
   m_radius = radius;
   m_color = "grey";
			  }
   Circle(int radius, String color)
   { 
	   m_radius = radius;
	   m_color =color;
   }
   
   double CalculateArea()
   {double area= 3.14 * m_radius* m_radius;
   return area;
   }
   void PrintColor()
   {System.out.println(" My color is  "+ m_color);
   }
   
}

