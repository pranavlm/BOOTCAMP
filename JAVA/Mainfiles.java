package java;

import java.util.Scanner;
import Package1.Geometry;

public class Mainfiles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Geometry g = new Geometry();
		int r,h;
		
		System.out.println("Enter the Radius and Height of the Cone : ");
		r = sc.nextInt();
		h = sc.nextInt();
		g.Cone(r,h);

		System.out.println("Enter the radius of the Sphere : ");
		r = sc.nextInt();
		g.Sphere(r);
		

		System.out.println("Enter the Radius and Height of the Cylinder : ");
		r = sc.nextInt();
		h = sc.nextInt();
		g.Cylinder(r,h);
	}

}
