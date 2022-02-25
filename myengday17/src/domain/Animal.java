package domain;

public class Animal implements Entity {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

	@Override
	public void species() {
		System.out.println("I am: animal");

	}

}
