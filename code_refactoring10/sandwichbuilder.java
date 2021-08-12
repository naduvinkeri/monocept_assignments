abstract class SandwichBuilder {
	
	Sandwich sandwich;
	
	public Sandwich getSandwich(){ return sandwich; }
	
	public void makeSandwich(){ sandwich = new Sandwich(); }
	
	public abstract void buildBread();
	public abstract void buildVegetables();
	public abstract void buildMeat();
	public abstract void buildCheese();
	public abstract void buildCondiments();
	

}

class BLTBuilder extends SandwichBuilder {

	public void buildBread() {
		
		sandwich.setBread("White Bread");
		
	}

	public void buildVegetables() {
		
		sandwich.setVegetables("Lettuce Tomato");
		
	}

	public void buildMeat() {
		
		sandwich.setMeat("Bacon");
		
	}

	public void buildCheese() {
		
		sandwich.setCheese("White Bread");
		
	}

	public void buildCondiments() {
		
		sandwich.setCondiments("Mayonnaise");
		
	}
	
}


class SandwichArtist {
	
	private SandwichBuilder sandwichBuilder;
	
	public void setSandwichBuilder(SandwichBuilder sandwichBuilder){
		
		this.sandwichBuilder = sandwichBuilder;
		
	}
	
	public Sandwich getSandwich(){ return sandwichBuilder.getSandwich(); }
	
	
	public void takeSandwichOrder(){
		
		sandwichBuilder.makeSandwich();
		sandwichBuilder.buildBread();
		sandwichBuilder.buildVegetables();
		sandwichBuilder.buildMeat();
		sandwichBuilder.buildCheese();
		sandwichBuilder.buildCondiments();
		
	}
	
}

class TestBuilder{
	
	public static void main(String[] args){
		
		SandwichArtist paul = new SandwichArtist();
		
		SandwichBuilder bltBuilder = new BLTBuilder();
		
		paul.setSandwichBuilder(bltBuilder);
		
		paul.takeSandwichOrder();
		
		Sandwich bltSandwich = paul.getSandwich();
		
		System.out.println(bltSandwich);
		
	}

}
