package User;

public class Student extends User {
    String matric_no = "bhu/20/04/05/0006";
    String admission_no = "30277779674";
    String registerCourse() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "You cannot register at this moment";
        } else {
            return "You have registered for all courses";
        }
    }
    String checkResults() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "Cannot check your result";
        } else {
            return "You got 7As and 2B";
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "chimaroke rex";
        student.password = "Spinny Fcode@1234";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());
    }
}
