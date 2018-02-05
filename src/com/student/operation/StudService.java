package com.student.operation;

import java.util.ArrayList;
import java.util.List;


public interface StudService 
{
	public int addStudent(StudentInfo st);
	public boolean deleteStudent(int id);
	public boolean updateStudent(StudentInfo st);
	public StudentInfo getStudent(int studId);
	public List<StudentInfo> getAllStudents();
}
class StudServiceImpl implements StudService
{
	List<StudentInfo> listOfStudents= new ArrayList<>();
	
	@Override
	public int addStudent(StudentInfo st) {
		listOfStudents.add(st);
		return st.getStudId();
	}

	@Override
	public boolean deleteStudent(int id) {
		boolean flag=false;
		for(int i=0; i<listOfStudents.size(); i++)
		{
			StudentInfo item= listOfStudents.get(i);
			if(item.getStudId()==id)
			{
				listOfStudents.remove(i);
				flag=true;
			}
		}
		
		return flag;
	}
	

	@Override
	public boolean updateStudent(StudentInfo st) 
	{
		boolean flag=false;
		for (int i=0; i<listOfStudents.size(); i++)
		{
			StudentInfo item=listOfStudents.get(i);
			if(item.getStudId()==st.getStudId())
			{
				flag=true;
			}
			
		}
		if(!flag)
		{
			addStudent(st);
			return flag;
		}
		for(int i=0;i<listOfStudents.size();i++) {
			StudentInfo item = listOfStudents.get(i);
				if(item.getStudId()==st.getStudId()){
					item.setStudName(st.getStudName());
					item.setStudAddress(st.getStudAddress());
					item.setMarks(st.getMarks());
					break;
				}
		}
		return false;
	}

	@Override
	public StudentInfo getStudent(int studId) 
	{
		StudentInfo st = null;
		for(int i=0;i<listOfStudents.size();i++) 
		{
			StudentInfo item = listOfStudents.get(i);
				if(item.getStudId()==studId)
				{
					st=listOfStudents.get(i);
					break;
				}
		}
		return st;
		
	}

	@Override
	public List<StudentInfo> getAllStudents() {
		
		return listOfStudents;
	}
	
}