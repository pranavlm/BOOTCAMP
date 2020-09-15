package java;
abstract class Area {
	abstract void Areacompute(int a);
}
class Square extends Area {
public void Areacompute(int a) {
System.out.println("area of square is:"+a*a+" sq units");
}
}
class Circle extends Area {
public void Areacompute(int a) {
	System.out.println("area of circle is:"+3.1415*a*a+" sq units");
}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		Square s=new Square();
		c.Areacompute(3);
		s.Areacompute(3);
		
	}

}
