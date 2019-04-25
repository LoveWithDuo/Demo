package JavaIO2;

public class CloneTest1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student student = new Student();
		student.setAge(20);
		student.setName("zhangsan");
		Student student2 = (Student)student.clone();
		System.out.println(student2.getAge());
		System.out.println(student2.getNme());
	}
}
class Student implements Cloneable{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNme() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public Object clone() throws CloneNotSupportedException  {
		Object object = super.clone();
		return object;
	}
	
	
}
