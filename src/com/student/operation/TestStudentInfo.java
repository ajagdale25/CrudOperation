package com.student.operation;



public class TestStudentInfo {

	public static void main(String[] args) 
	{
		Address pune= new Address("pune", 111111);
		Address mumbai= new Address("mumbai", 410218);
		
		StudentInfo s1= new StudentInfo(1, "Amol", 58, mumbai);
		StudentInfo s2= new StudentInfo(2, "Sunny dabade", 85, pune);
		StudentInfo s3= new StudentInfo(3, "abc",  83, pune);
		StudentInfo s4= new StudentInfo(4, "bcd", 40, mumbai);
		StudentInfo s5= new StudentInfo(5, "cde", 55, pune);
		StudentInfo s6= new StudentInfo(6, "def", 65, mumbai);
		StudentInfo s7= new StudentInfo(7, "efg", 55, mumbai);
		
		//StudentServiceImpl simpl = new StudentServiceImpl();
		StudService sservice = new StudServiceImpl();
		sservice.addStudent(s1);
		sservice.addStudent(s2);
		sservice.addStudent(s3);
		sservice.addStudent(s4);
		sservice.addStudent(s5);
		sservice.addStudent(s6);
		sservice.addStudent(s7);
							
		System.out.println("All Students: "+sservice.getAllStudents());//Getting the all list of students				
		System.out.println("Object id with 10 --"+sservice.getStudent(10));// null
		System.out.println("Object id with 2 --"+sservice.getStudent(2));//getting details of stud id 2
				
		System.out.println("remove object with id 66-- "+sservice.deleteStudent(66));//false
		
		System.out.println("remove object with id 6-- "+sservice.deleteStudent(6));//true  and removing student id 6 details		
		System.out.println("Before update --All student objects-- "+sservice.getAllStudents());//getting all students expect removing id details Stud id 6
		StudentInfo stx = new StudentInfo(9, "amruta",90,pune);
		System.out.println("Update with id 7-- "+sservice.updateStudent(stx));
		
		System.out.println("After Update --All student objects-- "+sservice.getAllStudents());//7Newlyadded

		
	}

}
