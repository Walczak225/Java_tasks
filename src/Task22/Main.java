package Task22;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        Teacher teacher1 = new Teacher("Jan", "jan.kowalski@szkola.pl", 45, "Kowalski", "Matematyka");
        Teacher teacher2 = new Teacher("Anna", "anna.nowak@szkola.pl", 38, "Nowak", "Fizyka");

        Student student1 = new Student("Adam", "adam.n@student.pl", 20, "Nowak", "Informatyka");
        Student student2 = new Student("Ewa", "ewa.w@student.pl", 22, "Wiśniewska", "Informatyka");

        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addStudent(student1);
        school.addStudent(student2);

        teacher1.addStudent(student1);
        teacher1.addStudent(student2);
        teacher2.addStudent(student1);

        System.out.println("--- STAN POCZĄTKOWY ---");
        System.out.println("Uczniowie Jana: " + school.getStudentsOfTeacher(teacher1));
        System.out.println("Nauczyciele Adama: " + school.getTeachersOfStudents(student1));

        System.out.println("\n--- USUWANIE ADAMA ---");
        school.removeStudent(student1);

        System.out.println("Uczniowie Jana po usunięciu Adama: " + school.getStudentsOfTeacher(teacher1));
        System.out.println("Uczniowie Anny po usunięciu Adama: " + school.getStudentsOfTeacher(teacher2));

        System.out.println("\n--- USUWANIE JANA ---");
        school.removeTeacher(teacher1);

        System.out.println("Nauczyciele Ewy po zwolnieniu Jana: " + school.getTeachersOfStudents(student2));
    }
}