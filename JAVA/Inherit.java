package java;
class Employee{
	 int empno;
	 String ename;
	public Employee(int x,String y)
	{
		empno=x;
		ename=y;
	}
	public void Dispdata() {
		System.out.println("Employee\nempno:"+empno+"\nename:"+ename);
	}
}
class SkilledAsst extends Employee{
	 int bonus;
	public SkilledAsst(int a,String b,int c) {
		super(a,b);
		bonus=c;
	}
	public void Dispdata() {
		System.out.println("\nSkilledAsst\nempno:"+empno+"\nename:"+ename+"\nbonus:"+bonus);
	}
}
public class Inherit{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e= new Employee(50,"Hari");
		e.Dispdata();
		SkilledAsst s=new SkilledAsst(60,"Rama",1000);
		s.Dispdata();
	}

}
