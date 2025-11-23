public class Department {
    private String departmentName;
    private String headOfDepartment;
    private String officeRoom;
    private String email;
    private String phoneNumber;
    private double budget;
    private static int totalDepartments = 0;
    private static final double UNIVERSITY_BUDGET = 1000000;
    
    public Department(String departmentName, String headOfDepartment, String officeRoom, String email, String phoneNumber, double budget) {
        this.departmentName = departmentName;
        this.headOfDepartment = headOfDepartment;
        this.officeRoom = officeRoom;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.budget = budget;
        this.totalDepartments++;
    }
    public Department() {
        this.departmentName = "ФСБ";
        this.headOfDepartment = "Kuplinov";
        this.officeRoom = "312";
        this.email = "kuplinov228@gmail.com";
        this.phoneNumber = "+77777777777";
        this.budget = 2300;
        this.totalDepartments++;
    }
    
    public Department(String departmentName, String headOfDepartment, String officeRoom) {
        this.departmentName = departmentName;
        this.headOfDepartment = headOfDepartment;
        this.officeRoom = officeRoom;
        this.totalDepartments++;
    }
    
    public String getDepartmentName() {
        return this.departmentName;
    }
    
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
    public String getHeadOfDepartment() {
        return this.headOfDepartment;
    }
    
    public void setHeadOfDepartment(String headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }
    
    public String getOfficeRoom() {
        return this.officeRoom;
    }
    
    public void setOfficeRoom(String officeRoom) {
        this.officeRoom = officeRoom;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        if (validateEmail(email)) {
            this.email = email;
        } 
    }
    
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        if (validatePhoneNumber(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        } 
    }
    
    public double getBudget() {
        return this.budget;
    }
    
    public void setBudget(double budget) {
        if (budget >= 0) {
            this.budget = budget;
        }
    }
    
    private boolean validatePhoneNumber(String phoneNumber) {
        for(int i = 0; i < phoneNumber.length(); i++) {
            char element = phoneNumber.charAt(i);
            if(element == ' ' || element == '-' || element == '(' || element == ')' || element == '+') {
                return false;
                break;   
            }
            if (i == phoneNumber.length() - 1) {
                return true;
            }

        }
    }
    
    public static int getTotalDepartments() {
        return this.totalDepartments;
    }
    
    public static boolean validateEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return email.matches(emailRegex);
    }
    
    public void contact() {
        contact("Общий запрос");
    }
    
    public void contact(String message) {
        System.out.println("--- Контакт с кафедрой " + departmentName + " ---");
        System.out.println("Сообщение: " + message);
        System.out.println("Заведующий: " + headOfDepartment);
        System.out.println("Кабинет: " + officeRoom);
    }
    
    public boolean allocateBudget(double amount) {
        return allocateBudget(amount, "Общие расходы");
    }
    
    public boolean allocateBudget(double amount, String purpose) {
        if (amount <= 0) {
            System.out.println("Stupid employee");
            return false;
        }
        
        if (amount > UNIVERSITY_BUDGET) {
            System.out.println("Stupid employee");
            return false;
        }
        
        double newBudget = this.budget + amount;
        if (newBudget > UNIVERSITY_BUDGET * 0.1) {
            System.out.println("Stupid employee");
            return false;
        }
        
        this.budget = newBudget;
        return true;
    }
    
}