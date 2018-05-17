public class Teacher {

    private String f_name;
    private String l_name;
    private char grade;
    private Classroom classroom;
    private Admin admin;

    public Teacher(String first, String last, char grade, Classroom classroom) {
        this.f_name = first;
        this.l_name = last;
        this.grade = grade;
        this.classroom = classroom;
        this.admin = Admin.getInstance();
    }

    public String getFirstName() {
        return f_name;
    }

    public String getLastName() {
        return l_name;
    }

    public char getGrade() {
        return grade;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void makeBadge(){

    }

    public void giveBadge(Student s){

    }
}