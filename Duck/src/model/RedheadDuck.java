package model;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
		setFlyBehavior(new FlywithWings());
		setQuackBehavior(new Quack());
		// TODO Auto-generated constructor stub
	//quackBehavior=new  Quack();
	//flyBehavior=new  FlywithWings();
	}
	public void display(){
		System.out.println("I'm RedheadDuck");			
	}	
}
