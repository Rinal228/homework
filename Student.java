public class Student{
	private String studentId;
	private String firstName;
	private String lastName;
	private int age;
	private double averageGrade;
	private String faculty;
	private static int totalStudents = 0;
	private static final String UNIVERSITY_NAME = "KFU";

	public Student() {
		this.studentId = "1234";
		this.firstName = "Elvin";
		this.lastName = "Presley";
		this.age = 67;
		this.averageGrade = 2;
		this.faculty = "chemistry";
	}
	public Student(String studentId, String firstName, String lastName, int age, double averageGrade, String faculty) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.averageGrade = averageGrade;
		this.faculty = faculty;
	}
	public Student(String studentId, int age, double averageGrade) {
		this.studentId = studentId;
		this.age = age;
		this.averageGrade = averageGrade;
	}
	public void displayInfo(){
		System.out.println(this.studentId);
		System.out.println(this.firstName);
		System.out.println(this.lastName);
		System.out.println(this.age);
		System.out.println(this.averageGrade);
		System.out.println(this.faculty);
	}
	public void displayInfo(boolean detailed){
		if(detailed) {
			System.out.println(this.studentId);
			System.out.println(this.firstName);
			System.out.println(this.lastName);
			System.out.println(this.age);
			System.out.println(this.averageGrade);
			System.out.println(this.faculty);
		} else {
			System.out.println(this.firstName);
			System.out.println(this.lastName);
			System.out.println(this.age);
		}
		
	}
	public updateGrade(double newGrade){
		this.averageGrade += 1.1; 
	}
	public updateGrade(double newGrade, String subject){
		if(this.faculty == subject) {
			this.averageGrade += 1.1; 
		}
		
	}
	static public int getTotalStudents(){
		return this.totalStudents;
	}
	public String getStudentId(){
		return this.studentId;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public int getAge(){
		return this.age;
	}
	public double getAverageGrade(){
		return this.averageGrade;
	}
	public String getFaculty(){
		return this.faculty;
	}
	public void setStudentId(String studentId){
		if (studentId != null && setStudentId != "") {
			this.studentId = studentId;
		}
		
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setAge(String age){
		if(age > 15 && age < 71) {
			this.age = age;
		}
		
	}
	public void setAverageGrade(String averageGrade){
		if (averageGrade >= 0 && averageGrade <= 5) {
			this.averageGrade = averageGrade;
		}
		
	}
	public void setFaculty(String faculty){
		this.faculty = faculty;
	}

}