package Package1;
import java.util.Scanner;

public class Geometry {
	static public void Cone(int radius,int height)
	{
		System.out.format("The Surface area of a Cone = %.4f\n",(Math.PI  * radius * (radius + Math.sqrt(radius * radius + height * height))));
		System.out.format("The Volume of a Cone = %.4f\n",(1.0/3) * Math.PI  * radius * radius * height);
		System.out.println();
	}
	static public void Sphere(int radius)
	{
		System.out.format("The Surface area of a Sphere = %.4f\n", 4 * Math.PI * radius * radius);
		System.out.format("The Volume of a Sphere = %.4f\n", (4.0 / 3) * Math.PI * radius * radius * radius);
		System.out.println();
	}
	static public void Cylinder(int radius,int height)
	{
		System.out.format("The Surface area of a Cylinder = %.4f\n", 2 * Math.PI * radius * (radius + height));
		System.out.format("The Volume of a Cylinder = %.4f\n", Math.PI * radius * radius * height);
		System.out.println();
	}
}
