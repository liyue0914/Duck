package model;
public abstract class Duck {
   QuackBehavior quackBehavior;
   FlyBehavior flyBehavior;

   public void swim(){
	System.out.println("i can swim");  
   }
   public void display(){
		System.out.println("i can display");  
	   }
   
   public void performQuack() {
      try {
		quackBehavior.quack();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   public void performFly() {
	   try {
		flyBehavior.fly();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   public void setQuackBehavior(
	         QuackBehavior behavior) {
	      this.quackBehavior = behavior;
	   }
	   public void setFlyBehavior(FlyBehavior flyBehavior){
		   this.flyBehavior=flyBehavior;
	}

}


