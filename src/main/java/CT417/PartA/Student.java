package CT417.PartA;


public class Student {
	private String Fname;
	private String Lname;
	private String DOB;
	private int SID;
	private int Age;
	private String Uname;

	public Student(String Fname, String Lname, int SID, int Age, String DOB) {
		this.Fname = Fname;
		this.Lname = Lname;
		this.SID = SID;
		this.Age = Age;
		this.DOB = DOB;
	}
	
	public String getUsername(){
		Uname = getFname()+getLname()+getAge();
		return Uname;
	}
/*Getter & Setter*/
	public String getFname() {
		return Fname;
	}

	public void setFname(String Fname) {
		this.Fname = Fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String Lname) {
		this.Lname = Lname;
	}

	public int getSID() {
		return SID;
	}

	public void setSID(int SID) {
		this.SID = SID;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String DOB) {
		this.DOB = DOB;
	}

	public String toString(){
	return "First name:"+getFname()+"\nLast name:"+getLname()+
				"\nStudent ID:"+getSID()+"\nUserName:"+
				getUsername()+"\nAge:"+getAge()+
				"\nDate of Birth:"+getDOB();
	
		
	}
}
