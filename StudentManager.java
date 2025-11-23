public class StudentManager{
	private Student[] students = new Student[3];
	private Course[] courses = new Course[3];
	private static int index = 0;

	public void addStudentToCourse(Student student, Course course) {
		this.students[index] = student;
		this.courses[index] = course;
		this.index++
	}
	public String findStudentById(String studentId) {
		for(int i = 0; i < 3; i++) {
			if(this.students[i].getStudentId().equals(studentId)) {
				System.out.println(this.students[i].getFirstName());
				break;
			}
		}
		
	}
	public String getStudentsByFaculty(String faculty) {
		for(int i = 0; i < 3; i++) {
			if(this.students[i].getFaculty().equals(faculty)) {
				System.out.println(this.students[i].getFirstName());
				break;
			}
		}
	}
	public String calculateFacultyAverage(String faculty) {
		int facultyAverage = 0;
		for(int i = 0; i < 3; i++) {
			if(this.students[i].getFaculty().equals(faculty)) {
				facultyAverage += this.students[i].getAverageGrade();
			}
		}
		System.out.println(facultyAverage);
		
	}
}