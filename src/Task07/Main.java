package Task07;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj numer telefonu: ");
        String number = scanner.next();
        String regex = "^[0-9]{3}-?[0-9]{3}-?[0-9]{3}$";
        if (number.matches(regex)){
            System.out.println("Numer poprawny");
        }else System.out.println("Nie poprawny ");

    }
}
