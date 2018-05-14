public class Teacher {

    private String fname;
    private String lname;
    private int grade_level;
    private int classroom;

    public Teacher(String first, String last, int grade, int ID) {
        this.fname=first;
        this.lname=last;
        this.grade_level=grade;
        this.classroom=ID;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getGrade_level() {
        return grade_level;
    }

    public int getClassroom() {
        return classroom;
    }

    public void makeBadge(){

    }

    public void giveBadge(Student s){

    }
    public void accessClass(){

    }
}