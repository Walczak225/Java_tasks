package Task06;

import java.util.Scanner;

public class trys {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoją liczbę: ");
        long number = scanner.nextLong();
        long copyNumber = number;
        long multiple = 1;
        long a = 0;
        long b = 0;

        while (copyNumber > 0){
            double n = copyNumber%10;
            if (n == 0){
                a += 2 * multiple;
                copyNumber -= 10;
            } else if (n == 1 && copyNumber > 10) {
                a += 2 * multiple;
                copyNumber -= 10;
            }else a += 1 * multiple;

            multiple *= 10;
            copyNumber /= 10;
            b = number - a;

        }
        System.out.println("Number: " + number);
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}
