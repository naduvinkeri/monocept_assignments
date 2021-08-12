public class ReplaceConditionalWithPoly {

	public static void main(String[] args){
		
		String doggy = "Dog";
		String kitty = "Cat";
		
		makeSound(doggy);
		
		Animal rex = new Dog("Woof");
		Animal sophie = new Cat("Meow");
		
		System.out.println(sophie.getSound());
		
	}
	
	static void makeSound(String animal){
		
		switch(animal){
		
		case "Dog":
			System.out.println("Woof");
			break;
			
		case "Cat":
			System.out.println("Meow");
			break;
			
		default:
			throw new RuntimeException("I Don't Know that Animal");
		
		}
		
	}
	
}

class Animal {
	
	private String sound = "";

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public Animal(String sound) {
		super();
		this.sound = sound;
	}
	
}

class Dog extends Animal{

	public Dog(String sound) {
		super(sound);
	}
	
}

class Cat extends Animal{

	public Cat(String sound) {
		super(sound);
	}
	
}
