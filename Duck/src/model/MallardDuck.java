package model;

public class MallardDuck extends Duck {

	public MallardDuck() {
		setFlyBehavior(new FlywithWings());
		setQuackBehavior(new Quack());
		// TODO Auto-generated constructor stub
	//quackBehavior=new  Quack();
	//flyBehavior=new  FlywithWings();
	}

	public void display(){
		System.out.println("I'm MallardDuck");			
	}	
}
