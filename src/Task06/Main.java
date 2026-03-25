package Task06;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj swoją liczbę: ");
        long number = scanner.nextLong();
        long a = 0;
        long multiple = 1;
        long copyN = number;

        while (copyN > 0){
        long n = copyN%10;
        if (n == 0){
            a += 2 * multiple;
            copyN -= 10;
        } else if (n == 1 && copyN > 10) {
            a += 2 * multiple;
            copyN -=10;
        }else {
            a += 1* multiple;
        }
        copyN /=10;
        multiple *=10;
        }
    long b = number - a;
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("Suma a+b: "+ (a+b));
    }
}
