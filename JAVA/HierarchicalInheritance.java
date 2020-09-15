package java;
class Animal {
	   public void display() {
	      System.out.println("Inside display");
	   }
	}
	class Cow extends Animal {
	   public void grass() {
	      System.out.println("eats grass");
	   }
	}
	class Tiger extends Animal {
	   public void meat() {
	      System.out.println("eats meat");
	   }
	}
	public class HierarchicalInheritance {
	   public static void main(String[] arguments) {
	      Cow c=new Cow();
	      Tiger t= new Tiger();
	      c.display();
	      c.grass();
	      t.display();
	      t.meat();
	   }
	}