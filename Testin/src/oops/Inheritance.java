package oops;

public class Inheritance {

	public static void main(String[] args) {

		BabyDog d = new BabyDog();
		d.weep();
		d.bark();
		d.eat();
	}
}

class Animal {
	void eat() {
		int a = 23;
		System.out.println("eating..." +a);
	}
}

class Dog extends Animal {
	void bark() {
		int b= 45;
		System.out.println("barking..."+b);
	}
}

class BabyDog extends Dog {
	void weep() {		System.out.println("weeping...");
	}
}
