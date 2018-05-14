public class Teacher {

    private String fname;
    private String lname;
    private int grade_level;
    private Classroom class_room;

    public Teacher(String first, String last, int grade, Classroom ID) {
        this.fname=first;
        this.lname=last;
        this.grade_level=grade;
        this.class_room=ID;
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

    public Classroom getClassroom() {
        return class_room;
    }

    public void makeBadge(){

    }

    public void giveBadge(Student s){

    }
}