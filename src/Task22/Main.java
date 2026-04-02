package Task22;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Tworzymy szkołę
        School school = new School();

        // 2. Tworzymy nauczyciela i studentów (Wymaganie 1 - poprawne dane)
        // Pamiętaj o swojej kolejności w konstruktorze Studenta: name, email, age, surname, field
        Teacher teacher1 = new Teacher("Jan", "jan.kowalski@szkola.pl", 45, "Kowalski", "Matematyka");
        Student student1 = new Student("Adam", "adam.nowak@student.pl", 20, "Nowak", "Informatyka");
        Student student2 = new Student("Ewa", "ewa.w@student.pl", 22, "Wiśniewska", "Informatyka");
        Student student3 = new Student("Michał", "michal.k@student.pl", 19, "Abacki", "Fizyka");

        // Dodajemy do szkoły
        school.addTeacher(teacher1);
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        student1.removeTeacher(teacher1);

        // 3. Testujemy relacje (Wymaganie 2)
        teacher1.addStudent(student1);
        teacher1.addStudent(student2);

        System.out.println("--- RELACJE ---");
        System.out.println("Studenci Pana Jana: " + school.getStudentsOfTeacher(teacher1));
        System.out.println("Nauczyciele Adama: " + school.getTeachersOfStudents(student1));

        // 4. Testujemy wyszukiwanie (Wymaganie 5)
        System.out.println("\n--- WYSZUKIWANIE ---");
        List<Student> found = school.findStudentsByNameAndSurname("Adam", "Nowak");
        System.out.println("Znaleziono: " + found);

        // 5. Testujemy sortowanie i stronicowanie (Wymaganie 3)
        System.out.println("\n--- STRONICOWANIE I SORTOWANIE ---");
        school.sortStudentsBySurname();
        List<Student> page1 = school.getStudentsPage(1, 2); // strona 1, 2 wyniki
        System.out.println("Strona 1 (posortowana po nazwisku): " + page1);

    }
}
