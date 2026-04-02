package Task22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class School {
    private List<Teacher> allTeachers;
    private List<Student> allStudents;

    public School() {
        this.allTeachers = new ArrayList<>();
        this.allStudents =  new ArrayList<>();
    }
    public void addStudent(Student student){
        allStudents.add(student);
    }
    public void addTeacher(Teacher teacher){
        allTeachers.add(teacher);
    }

    public List<Student> findStudentsByNameAndSurname(String name, String surname){
        List<Student> res = new ArrayList<>();
        for(Student student : allStudents){
            if(name.equals(student.getName()) && surname.equals(student.getSurname())){
                res.add(student);
            }
        }
        return res;
    }
    public List<Teacher> getTeachersOfStudents(Student student) {
        return student.getTeachers();
    }
    public List<Student> getStudentsOfTeacher(Teacher teacher) {
        return teacher.getStudents();
    }
    public void sortStudentsBySurname(){
        allStudents.sort(Comparator.comparing(Student::getSurname));
    }
    public List<Student> getStudentsPage(int pageNumber, int pageSize){
        int fromIndex = (pageNumber - 1) * pageSize;
        int toIndex = Math.min(fromIndex + pageSize, allStudents.size());
        return allStudents.subList(fromIndex, toIndex);
    }
    public void removeStudent(Student student) {
        List<Teacher> teachersCopy = new ArrayList<>(student.getTeachers());
        for (Teacher teacher : teachersCopy) {
            student.removeTeacher(teacher);
        }
        allStudents.remove(student);
    }
    public void removeTeacher(Teacher teacher) {
        List<Student> studentsCopy = new ArrayList<>(teacher.getStudents());
        for (Student student : studentsCopy) {
            teacher.removeStudent(student);
        }
        allTeachers.remove(teacher);
    }

}
