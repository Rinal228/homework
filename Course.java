public class Course {
    private String courseCode;
    private String courseName;
    private int maxStudents;
    private int currentStudents;
    private boolean isActive;
    private static int totalCourses = 0;
    private static final int MAX_CREDITS_PER_SEMESTER = 30;
    
    public Course(String courseCode, String courseName, boolean isActive) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.isActive = isActive;
        this.totalCourses++;
    }
    
    public Course() {
        this.courseCode = "345";
        this.courseName = "Java";
        this.maxStudents = 20;
        this.currentStudents = 0;
        this.isActive = true;
        this.totalCourses++;
    }
    public Course(String courseCode, String courseName, int maxStudents, int currentStudents, boolean isActive) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxStudents = maxStudents;
        this.currentStudents = currentStudents;
        this.isActive = isActive;
        this.totalCourses++;
    }
    
    public String getCourseCode() {
        return this.courseCode;
    }
    
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    public String getCourseName() {
        return this.courseName;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public int getMaxStudents() {
        return this.maxStudents;
    }
    
    public void setMaxStudents(int maxStudents) {
       this.maxStudents = maxStudents;
    }
    
    public int getCurrentStudents() {
        return this.currentStudents;
    }
    
    public void setCurrentStudents(int currentStudents) {
        if (currentStudents <= this.maxStudents) {
            this.currentStudents = currentStudents;
        } 
    }
    
    public boolean getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    public static int getTotalCourses() {
        return this.totalCourses;
    }
    
    public static double calculateWorkload(int credits) {
        return credits * 2.5;
    }
    
    public boolean enrollStudent() {
        return enrollStudent("Неизвестный студент");
    }
    
    public boolean enrollStudent(String studentId) {
        
        if (this.currentStudents < this.maxStudents) {
            currentStudents++;
            System.out.println("Студент " + studentId + " успешно записан на курс " + courseCode);
            return true;
        } else {
            System.out.println("Невозможно записать студента " + studentId + ". Достигнуто максимальное количество студентов.");
            return false;
        }
    }
    
    public void displayInfo() {
        displayInfo(false);
    }
    
    public void displayInfo(boolean showAvailability) {
        System.out.println(courseCode);
        System.out.println(courseName);
        System.out.println(maxStudents);
        System.out.println(currentStudents);
        System.out.println(isActive);
        
        if (showAvailability) {
            int available = this.maxStudents - this.currentStudents;
            System.out.println("Доступных мест: " + available);
        }
    }
}