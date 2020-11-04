package klas11g;

public class Student {
	
	private String Name;
	private double Grade;
	
	public Student(){}
	
	public Student(String _name, double _grade){
		this.Name = _name;
		this.Grade = _grade;
	}
	
	public static boolean stip(Student S) {
		return (S.Grade>=5.5);
	}
	
	public String getName() {
		return this.Name;
	}
	
	public void setName(String _name) {
		this.Name = _name;
	}
	
	public double getGrade() {
		return this.Grade;
	}
	
	public void setGrade(double _grade) {
		this.Grade = _grade;
	}
	
	@Override
	public String toString() {
		return "Name : " + this.Name + "	Grade : " + this.Grade;
	}
	
}
