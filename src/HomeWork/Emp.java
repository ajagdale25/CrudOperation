package HomeWork;

 abstract class Emp {
	 
	 public static void main(String[] args) {
			
		 Emp e = new XEmp();
		 e.m2();
	 }
	
	public abstract void m1();
	public void m2() {
		System.out.println("Emp class method");
	}
		
	

	

public void m3() {

}
	 }
	 
	
 class XEmp extends Emp
{
	
	
	@Override
	public void m1() {
		System.out.println("Xemp class method");
		
	}
	
	public void m2() {
		super.m2();
	}
	public void m4() {
	}
	
}
