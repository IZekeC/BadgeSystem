/*
    This is a student at a school
 */

public class Student
{
    private String f_name;
    private String l_name;
    private String stud_id;
    private int grade;
    private Classroom classroom;
    private Backpack backpack;

    //If a student does not have a backpack i.e, never been entered into the program before
    public Student(String f_name, String l_name, String stud_id, int grade, Classroom classroom) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.stud_id = stud_id;
        this.grade = grade;
        this.classroom = classroom;
    }

    //If a student has a backpack i.e, has been entered into the program before
    public Student(String f_name, String l_name, String stud_id, int grade, Classroom classroom, Backpack backpack) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.stud_id = stud_id;
        this.grade = grade;
        this.classroom = classroom;
        this.backpack = backpack;
    }

    public String getFirstName() {
        return f_name;
    }

    public String getLastName() {
        return l_name;
    }

    public String getStud_id() {
        return stud_id;
    }

    public int getGrade() {
        return grade;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void makeBackpack() {

    }
}
