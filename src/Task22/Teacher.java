package Task22;

import java.util.ArrayList;
import java.util.List;
    public class Teacher extends Person {
        private String subject;
        private List<Student> students;

        public Teacher(String name, String email, int age, String surname, String subject) {
            super(name, email, age, surname);
            this.subject = subject;
            this.students = new ArrayList<>();
        }

    public void addStudent(Student student) {
        if(!students.contains(student)) {
            students.add(student);
            student.addTeacher(this);
        }
    }
    public void removeStudent(Student student) {
        if(students.contains(student)) {
            students.remove(student);
            student.removeTeacher(this);
        }
    }

        public List<Student> getStudents() {
            return students;
        }
    }

