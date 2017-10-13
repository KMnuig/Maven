package CT417.PartA;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;


public class Course {
	private String CourseName;
	List<Module> modules = new ArrayList<Module>();
	private LocalDate StartDate;
	private LocalDate EndDate;
	
	public Course(String CourseName,LocalDate StartDate,LocalDate EndDate){
		this.CourseName = CourseName;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}
	
	public List<Module> getModules(){
		return this.modules;
	}

	public void addModule(Module m){
		modules.add(m);
	}
	
	public String toString(){
		String str ="";
		for (Module s : modules){
			str += s.toString()+"\n";
			
		}
		return CourseName+"\nStart: "+StartDate+"\nEnd: "+EndDate+"\n----Module---\n"+str;
	}
}
