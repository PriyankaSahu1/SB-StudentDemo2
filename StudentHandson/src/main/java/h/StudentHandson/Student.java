package h.StudentHandson;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int roll;
	private String name;
	private String stream;
	private String grade;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int roll, String stream, String grade) {
		super();
		this.name = name;
		this.roll = roll;
		this.stream = stream;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", stream=" + stream + ", grade=" + grade + "]";
	}
	

}
