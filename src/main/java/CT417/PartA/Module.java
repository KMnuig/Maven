package CT417.PartA;

import java.util.ArrayList;
import java.util.List;

public class Module {

	private String module;
	private String MID;
	List<Student> students =new ArrayList<Student>();
	
	public Module(String module, String MID){
		this.module=module;
		this.MID =MID;
	}
	public List<Student> getStudents(){
		return this.students;
	}
	public void addStudent(Student s){
		students.add(s);
	}
	
	public String toString(){
		String str ="";
		for(Student s: students){
			str+=s.toString()+"\n";
		}
		if (str==""){
			str ="no Students attend this class";
		}
		return module+"\nID:"+MID+"\n-----Students------\n"+str;
	}
}
	