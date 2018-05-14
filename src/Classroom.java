/*
    This is a classroom in the school
 */

import java.util.ArrayList;

public class Classroom
{
    private String classroom_id;
    private Teacher teacher;
    private ArrayList<Student> students;

    public Classroom(String classroom_id) {
        this.classroom_id = classroom_id;
        this.students = new ArrayList<>();
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
