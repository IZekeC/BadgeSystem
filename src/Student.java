/*
    This is a student at a school
 */

public class Student
{
    private String name;
    private String stud_id;
    private Classroom classroom;
    private Backpack backpack;

    //If a student does not have a backpack i.e, never been entered into the program before
    public Student(String name, String stud_id, Classroom classroom) {
        this.name = name;
        this.stud_id = stud_id;
        this.classroom = classroom;
    }

    //If a student has a backpack i.e, has been entered into the program before
    public Student(String name, String stud_id, Classroom classroom, Backpack backpack) {
        this.name = name;
        this.stud_id = stud_id;
        this.classroom = classroom;
        this.backpack = backpack;
    }

    public String getName() {
        return name;
    }

    public String getStud_id() {
        return stud_id;
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
