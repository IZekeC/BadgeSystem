public class Teacher {

    private String Fname;
    private String Lname;
    private int grade;
    private Classroom classroom;

    public Teacher(String first, String last, int grade, Classroom ID) {
        this.Fname=first;
        this.Lname=last;
        this.grade=grade;
        this.classroom=ID;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public int getGrade_level() {
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