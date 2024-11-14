package oops;

class Animal{
	public void makeSound() {
		System.out.println("Animal make a sound: ");
	}
}
class Dog extends Animal{
	public void makeSound() {
		System.out.println("the dog barks:");
	}
}
class Cat extends Animal{
	public void makeSound() {
		System.out.println("the cat meows:");
	}
}

public class Ass2 {

	public static void main(String[] args) {
		Animal h1=new Dog();
		Animal h2=new Cat();
		h1.makeSound();
		h2.makeSound();

	}

}
