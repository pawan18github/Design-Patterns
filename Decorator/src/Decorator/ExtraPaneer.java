package Decorator;

public class ExtraPaneer extends ToppingDecorator{
	
	public ExtraPaneer(BasePizza basePizza) {
		super(basePizza);
	}

	@Override
	public int cost() {		
		return this.basePizza.cost()+20;
	}

}
