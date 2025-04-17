package carbuy;

public class Owner {

		private String name;

public Owner(String name) {
	this.name = name;
}

public String getName() {
	return name;
	
}
}
abstract class Car {
	private String name;
	private int year;
	private Owner owner;
	
	
	public Car(String name, int year, Owner owner) {
		this.name = name;
		this.year = year;
		this.owner = owner;
	}
	
	public String getName() {
		return name;
		
	}
	
	public Owner getOwner() {
		return owner;
		
	}
	
	public abstract void makeSound(); // polymorphism
}
class Toyota extends Car {
	public Toyota( String name, int year, Owner owner) {
		super(name, year, owner);
	}
	
	@Override
    public void makeSound() {
        System.out.println(getName() + " says: Vroom!");
    }
}

// Tesla class inherits Car
class Tesla extends Car {
    public Tesla(String name, int age, Owner owner) {
        super(name, age, owner);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Beep!");
    }
}

	
	





