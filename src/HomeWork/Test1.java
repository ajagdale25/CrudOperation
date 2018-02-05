package HomeWork;

public class Test1 {
	public static void main(String[] args) {
		OverrideDemo a= new Test();
		OverrideDemo a1= new OverrideDemo() {
			
			@Override
			void aMethod() {
				// TODO Auto-generated method stub
				
			}
		};
		//a1.aMethod();
		a1.m1();
		a.m1();        //m1 child
		a.aMethod();   //Hi I'm in child class
		a1.m1();//m2 parent
	
		
	}

}
