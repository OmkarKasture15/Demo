import java.security.PrivateKey;

public class Test {
	 
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1=new Employee("john", 1000);
		System.out.println(e1);		
		Employee e2= e1.clone();		//hashcode is different of clones & it is a Shallow clowning
		System.out.println(e2);
		
		
	
}
	
	
}
class Employee implements Cloneable{								//cloneable :The interface which dont have anything is a empty interface 
																	//cloneable It is a marker Interface
   
	
	
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		
//		Employee e= (Employee) super.clone();
//		return e;
		
		return (Employee)super.clone();
	}

	private String name;
   private int sal;
   
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   public int getSal() {
	return sal;
   }
   public void setSal(int sal) {
	this.sal = sal;
   }
   public Employee(String name, int sal) {
	super();
	this.name = name;
	this.sal = sal;
   }
   
   @Override
   public String toString() {
	return "Employee [name=" + name + ", sal=" + sal + "]";
   }
   
   
   
	
}