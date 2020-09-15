package java;
import java.util.Scanner;

class OverloadDemo
{
    void Area(int x)
    {
        System.out.println("area of the square is "+x*x+" sq units\n");
    }
    void Area(int x, int y)
    {
        System.out.println("area of the rectangle is "+x*y+" sq units\n");
    }
    void Area(float x)
    {
        double z = 3.1415 * x * x;
        System.out.println("area of the circle is "+z+" sq units");
    }
}
public class OverloadClass 
{
     public static void main(String args[]) 
	{
    	 Scanner sc = new Scanner(System.in);
    	 OverloadDemo ob = new OverloadDemo();
    	 int a,b;
    	 System.out.println("Enter the value of a side for area of square:");
    	 a = sc.nextInt();
    	 ob.Area(a);
    	 System.out.println("Enter the value of two sides for area of rectangle:");
    	 a = sc.nextInt();
    	 b = sc.nextInt();
    	 ob.Area(a,b);
    	 System.out.println("Enter the value of radius for area of circle:");
    	 float p = sc.nextFloat();
    	 ob.Area(p);
    }
}
