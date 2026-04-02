package Task22;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private String field;
    private List<Teacher> teachers;

    public Student(String name, String email, int age, String surname, String field) {
        super(name, email, age, surname);
        this.field = field;
        this.teachers = new ArrayList<>();
    }


    public void addTeacher(Teacher teacher){
        if(!teachers.contains(teacher)){
            teachers.add(teacher);
            teacher.addStudent(this);
        }
    }
    public void removeTeacher(Teacher teacher){
        if(teachers.contains(teacher)){
            teachers.remove(teacher);
            teacher.removeStudent(this);
        }
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}
