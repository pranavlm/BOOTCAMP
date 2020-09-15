package Package;


public class AreaVolume {
	public void Cylinder(int radius,int height)
	{
		System.out.format("The Surface area of a Cylinder = %.4f\n", 2 * Math.PI * radius * (radius + height));
		System.out.format("The Volume of a Cylinder = %.4f\n", Math.PI * radius * radius * height);
		System.out.println();
	}
	static public void Cone(int radius,int height)
	{
		System.out.format("The Surface area of a Cone = %.4f\n",(Math.PI  * radius * (radius + Math.sqrt(radius * radius + height * height))));
		System.out.format("The Volume of a Cone = %.4f\n",(1.0/3) * Math.PI  * radius * radius * height);
		System.out.println();
	}
}
