package test;

import model.Duck;
import model.MallardDuck;
import model.RedheadDuck;
import model.RubberDuck;


public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     
			Duck  redHead=new RedheadDuck();
			redHead.display();
			redHead.performQuack();
			redHead.performFly();
			redHead.swim();
		
			Duck rubber=new RubberDuck();
			rubber.display();
			rubber.performFly();
			rubber.performQuack();
			rubber.swim();
			
			Duck mallard=new MallardDuck();
			mallard.display();
			mallard.performFly();
			mallard.performQuack();
			mallard.swim(); 

	}

}
