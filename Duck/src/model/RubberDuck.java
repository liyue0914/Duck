package model;

public class RubberDuck extends Duck {
	public RubberDuck() {
		setFlyBehavior(new Flynoway());
		setQuackBehavior(new Squack());
		// TODO Auto-generated constructor stub
	//quackBehavior=new  Squack();
	//flyBehavior=new Flynoway();
	}
	public void display(){
		System.out.println("I'm RubberDuck");			
	}	
}
