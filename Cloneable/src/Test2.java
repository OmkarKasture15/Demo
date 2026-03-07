
public class Test2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s1 = new Student( 12,"sachin");
		System.out.println(s1);
		Student s2= s1.clone();
		System.out.println(s2);
	}
}
class Student implements Cloneable{
	
	private int rolno;
	private String name;
	
	
	@Override
	protected Student clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//Student s=(Student) super.clone();
		
		return (Student) super.clone() ;
	}
	
	
	public int getRolno() {
		return rolno;
	}
	public void setRolno(int rolno) {
		this.rolno = rolno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Student(int rolno, String name) {
		super();
		this.rolno = rolno;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Student [rolno=" + rolno + ", name=" + name + "]";
	}
	
	
	
	
	
}
