package klas11g;

import java.util.Objects;

public class Course {
	
	private String courseName;	
	private String [] students = new String [100];
	private int numberOfStudents = 0;
	
	public Course(String _courseName) {
		this.courseName = _courseName;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void addStudent(String student) {
		this.students[this.numberOfStudents] = student;
		this.numberOfStudents++;
	}
	
	public void dropStudent(String student) {
		for(int i =0;i<this.numberOfStudents;i++) {
			if(Objects.equals(this.students[i], student)) {
				this.shiftArr(i);
				return;
			}
		}	
	}

	private void shiftArr(int fromWhere) {
		for(int i = fromWhere+1; i<this.numberOfStudents;i++) {
			this.students[i-1] = this.students[i];
		}
		this.students[this.numberOfStudents-1] = null;
	}
	
	public String [] getStudents() {
		return this.students;
	}
	
}
