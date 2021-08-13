public abstract class Monster {

	private String name;
	
	MonsterAttackPower attackPower;
	MonsterAttackRange attackRange;
	
	abstract void makeMonster();
	
	public void checkIfVictimIsInRange(){
		
		System.out.println(getName() + " checks if victim is " + attackRange);
		
	}
	
	public void attackTheVictim(){
		
		System.out.println(getName() + " attacks the victim for " + attackPower);
		
	}
	
	public String toString(){
		
		String infoOnMonster = getName() + " attacks anything " + attackRange + 
				" for " + attackPower;
		
		return infoOnMonster;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

interface MonsterAttackPower{
	
	public String toString();
	
}

class BasicAttack implements MonsterAttackPower{
	
	public String toString(){
		
		return "10 in damage";
		
	}
	
}

class MediumAttack implements MonsterAttackPower{
	
	public String toString(){
		
		return "20 in damage";
		
	}
	
}

interface MonsterAttackRange{
	
	public String toString();
	
}

class BasicRange implements MonsterAttackRange{
	
	public String toString(){
		
		return "5 away";
		
	}
	
}

class MediumRange implements MonsterAttackRange{
	
	public String toString(){
		
		return "10 away";
		
	}
	
}

interface MonsterFactory{
	
	public MonsterAttackPower assignAttackPower();
	public MonsterAttackRange assignAttackRange();
	
}

class ZombieFactory implements MonsterFactory{

	public MonsterAttackPower assignAttackPower() {
		
		return new BasicAttack();
		
	}

	public MonsterAttackRange assignAttackRange() {
		
		return new BasicRange();
		
	}
	
}

class VampireFactory implements MonsterFactory{

	public MonsterAttackPower assignAttackPower() {
		
		return new MediumAttack();
		
	}

	public MonsterAttackRange assignAttackRange() {
		
		return new MediumRange();
		
	}
	
}

class Zombie extends Monster{
	
	MonsterFactory monsterFactory;
	
	public Zombie(MonsterFactory monsterFactory) {
		this.monsterFactory = monsterFactory;
	}

	void makeMonster() {
		
		System.out.println("Making a Zombie");
		
		attackPower = monsterFactory.assignAttackPower();
		attackRange = monsterFactory.assignAttackRange();
		
	}
	
}

class Vampire extends Monster{
	
	MonsterFactory monsterFactory;
	
	public Vampire(MonsterFactory monsterFactory) {
		this.monsterFactory = monsterFactory;
	}

	void makeMonster() {
		
		System.out.println("Making a Vampire");
		
		attackPower = monsterFactory.assignAttackPower();
		attackRange = monsterFactory.assignAttackRange();
		
	}
	
}

abstract class MonsterBuilder {
	
	protected abstract Monster makeMonster(String typeOfMonster);
	
	public Monster orderAMonster(String typeOfMonster){
		
		Monster theMonster = makeMonster(typeOfMonster);
		
		theMonster.makeMonster();
		theMonster.checkIfVictimIsInRange();
		theMonster.attackTheVictim();
		
		return theMonster;
		
	}
	
}

class OrderAMonster extends MonsterBuilder{

	protected Monster makeMonster(String typeOfMonster) {
		
		Monster theMonster = null;
		
		if(typeOfMonster.equals("Zombie")){
			
			MonsterFactory monsterFactory = new ZombieFactory();
			
			theMonster = new Zombie(monsterFactory);
			
			theMonster.setName("Zombie Bob");
			
		} else
			
			if(typeOfMonster.equals("Vampire")){
				
				MonsterFactory monsterFactory = new VampireFactory();
				
				theMonster = new Vampire(monsterFactory);
				
				theMonster.setName("Vampire Paul");
				
			}
		
		return theMonster;
		
	}
	
}

class MonsterMakerTest{
	
	public static void main(String[] args){
		
		MonsterBuilder monsterBuilder = new OrderAMonster();
		
		Monster zombie = monsterBuilder.orderAMonster("Zombie");
		
		System.out.println(zombie + "\n");
		
		Monster vampire = monsterBuilder.orderAMonster("Vampire");
		
		System.out.println(vampire + "\n");
		
	}
	
}
