public abstract class Sandwich {
	
	final void makeSandwich(){
		
		System.out.println("\n------NEW ORDER------\n");
		
		cutBun();
		
		if(customerWantsMeat()){
			
			addMeat();
			
		}
		
		addVegetables();
		
		if(customerWantsCondiments()){
		
			addCondiments();
		
		}
		
		wrapSandwich();
		
	}
	
	abstract void addMeat();
	abstract void addCondiments();
	
	public void cutBun(){
		
		System.out.println("The Bun is Cut");
		
	}
	
	public void addVegetables(){
		
		System.out.println("Lettuce, onions & Tomatoes Added");
		
	}
	
	public void wrapSandwich(){
		
		System.out.println("The Sandwich is Wrapped");
		
	}l
	
	boolean customerWantsMeat(){ return true; }
	
	boolean customerWantsCondiments(){ return true; }

}
