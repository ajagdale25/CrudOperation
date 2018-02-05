import java.util.*;

public class ComparableDemo {

	public static void main(String[] args) 
	{
		Student st1= new Student(1, "Amol",25, 200);
		Student st2= new Student(2, "Amit",22, 2000);
		Student st3= new Student(15, "Sayali",24, 1200);
		Student st4= new Student(7, "Prasad",27, 1900);
		Student st5= new Student(7, "Prasad",27, 1900);
		Student st6=st2;

		List<Student> list= new ArrayList<Student>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		list.add(st6);
		
		System.out.println("Before Sorting List....");
		System.out.println(list);
		
		System.out.println("After Sorting List....");
		Collections.sort(list);
		System.out.println(list);
		
		Set<Student> set= new HashSet<Student>();
		set.add(st1);
		set.add(st2);
		set.add(st3);
		set.add(st4);
		set.add(st5);
		set.add(st6);
		System.out.println("Set....");
		System.out.println(set);
		/*Set<Student> lset= new LinkedHashSet<Student>();
		lset.add(st1);
		lset.add(st2);
		lset.add(st3);
		lset.add(st4);
		lset.add(st5);
		lset.add(st6);
		System.out.println("LinkedHaashSet....");
		System.out.println(lset);
		*/
		Set<Student> t= new TreeSet<Student>(set);
		System.out.println("After Sorting with treeSet..  it is not allowed ...");
		System.out.println(t);
				
		
	}

}
class Student implements Comparable<Student>
{
	int id;
	String name;
	int age;
	double salary;
	public Student(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	/*@Override
	public int compareTo(Student ob) {
		return (this.age - ob.age);
	}*/
	@Override
	public int compareTo(Student ob) {
		return (this.id - ob.id);
	}
	
	
	
}
