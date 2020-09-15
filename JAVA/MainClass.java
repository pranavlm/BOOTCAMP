package java;
import java.util.Scanner;

interface Fig
{
	public void Area(int a,int b);
}
class Triangle implements Fig
{
	public void Area(int a,int b)
	{
		System.out.println("Area of the triangle is: "+(a*b)/2+" sq units");
	}
}
class Rect implements Fig
{
	public void Area(int a,int b)
	{
		System.out.println("Area of the rectangle is: "+a*b+" sq units\n");
	}
}
public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangle t = new Triangle();
		Rect r = new Rect();
		System.out.println("Enter length and breadth of Rectangle");
		int a = sc.nextInt();
		int b = sc.nextInt();
		r.Area(a, b);
		System.out.println("Enter base and height of Triangle");
		a = sc.nextInt();
		b = sc.nextInt();
		t.Area(a, b);
	}

}
