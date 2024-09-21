package Decorator;

public class ExtraCheese extends ToppingDecorator{
	
	public ExtraCheese(BasePizza basePizza) {
		super(basePizza);
	}

	@Override
	public int cost() {
		return this.basePizza.cost()+10;
	}

}
