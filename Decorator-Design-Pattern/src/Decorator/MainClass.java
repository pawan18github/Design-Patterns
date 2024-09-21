package Decorator;

public class MainClass {

	public static void main(String[] args) {
		BasePizza basePizza=new ExtraCheese(new ExtraPaneer(new CheesePizza()));
		System.out.print(basePizza.cost());
	}
}
